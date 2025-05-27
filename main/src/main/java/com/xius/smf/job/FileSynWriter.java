package com.xius.smf.job;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;

public class FileSynWriter implements Closeable {
    private static final Logger LOGGER = Logger.getLogger(FileSynWriter.class.getName());
    private static volatile FileSynWriter instance;
    
    private String filePath;
    private String fileName;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private long lastFileCreationTime = 0;
    private static final long FIFTEEN_MINUTES = 15 * 60 * 1000; // 15 minutes in milliseconds

    private FileSynWriter() throws IOException {
        createNewFile();
    }

    public static FileSynWriter getInstance() {
        if (instance == null) {
            synchronized (FileSynWriter.class) {
                if (instance == null) {
                    try {
                        instance = new FileSynWriter();
                    } catch (IOException e) {
                        LOGGER.log(Level.SEVERE, "Failed to create FileSynWriter instance", e);
                        throw new RuntimeException("Could not initialize FileSynWriter", e);
                    }
                }
            }
        }
        return instance;
    }

    private synchronized void createNewFile() throws IOException {
        // Close existing writers if they exist
        closeWriters();

        // Generate new filename
        this.fileName = generateTimeAppendedFileName("hlrout", "txt");
        String basePath = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch_FILE_PATH);
        
        // Ensure directory exists
        File directory = new File(basePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        
        this.filePath = basePath + File.separator + this.fileName;
        this.fileWriter = new FileWriter(filePath, true);
        this.bufferedWriter = new BufferedWriter(fileWriter);
        
        // Update last file creation time
        this.lastFileCreationTime = System.currentTimeMillis();
    }

    private void closeWriters() {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Error closing buffered writer", e);
            }
        }
        
        if (fileWriter != null) {
            try {
                fileWriter.close();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Error closing file writer", e);
            }
        }
    }

    public synchronized void writeFile(String message) {
        try {
            // Check if we need to create a new file
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastFileCreationTime >= FIFTEEN_MINUTES) {
                createNewFile();
            }

            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Failed to write to file: " + filePath, e);
        }
    }

    @Override
    public void close() {
        closeWriters();
    }

    public static String generateTimeAppendedFileName(String baseName, String extension) {
        Calendar now = Calendar.getInstance();
        // Round down to the nearest 15-minute interval
        int minute = now.get(Calendar.MINUTE);
        int roundedMinute = (minute / 15) * 15;
        now.set(Calendar.MINUTE, roundedMinute);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm");
        String timestamp = formatter.format(now.getTime());
        return baseName + "_" + timestamp + "." + extension;
    }

    // Java 6 compatible cleanup method
    @Override
    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}