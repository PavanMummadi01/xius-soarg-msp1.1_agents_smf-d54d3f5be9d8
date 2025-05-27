package com.xius.smf.utils;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FileUtils {

	private static  Logger logger = LogManager.getLogger("FileUtils");

	private FileUtils() {
		
	}
	
	public static boolean isDirExists(String dirName) {
		boolean isDirsExists = false;
		
		File dummyDir = new File(dirName);
		if(dummyDir != null && dummyDir.isDirectory() && dummyDir.exists()) {
			isDirsExists = true;
		} else {
			logger.error("Directory does not exists : " + dirName);
		}
		
		return isDirsExists;
	}
	
	public static boolean isDirExists(File dirName) {
		boolean isDirsExists = false;
		
		if(dirName != null && dirName.isDirectory() && dirName.exists()) {
			isDirsExists = true;
		} else {
			logger.error("Directory does not exists : " + dirName);
		}
		
		return isDirsExists;
	}
	
	public static boolean isFileExists(String fileName) {
		boolean isDirsExists = false;
		
		File dummyFile = new File(fileName);
		if(dummyFile != null && dummyFile.isFile() && dummyFile.exists()) {
			isDirsExists = true;
		} else {
			logger.error("File does not exists : " + fileName);
		}
		
		return isDirsExists;
	}
	
	public static boolean isFileExists(File fileName) {
		boolean isDirsExists = false;
		
		if(fileName != null && fileName.isFile() && fileName.exists()) {
			isDirsExists = true;
		} else {
			logger.error("File does not exists : " + fileName);
		}
		
		return isDirsExists;
	}
	
	public static boolean deleteFile(String fileName) {
		boolean isDeleted = false;
		
		File dummyFile = new File(fileName);
		
		isDeleted = deleteFile(dummyFile);
		
		return isDeleted;
	}
	
	public static boolean deleteFile(File fileName) {
		boolean isDeleted = false;
		
		try {
			if(isFileExists(fileName)) {
				isDeleted = fileName.delete();
			}
		} catch (SecurityException e) {
			logger.error("SecurityException while deleting a local file: " + Utilities.getStackTrace( e ));
		} catch (Exception e1) {
			logger.error("Exception while deleting a local file: " + Utilities.getStackTrace( e1 ));
		}
		
		return isDeleted;
	}
	
	public static boolean deleteDirectory(String dirName) {
		boolean isDeleted = false;
		
		File dummyDir = new File(dirName);
		
		isDeleted = deleteDirectory(dummyDir);
		
		return isDeleted;
	}
	
	public static boolean deleteDirectory(File dirName) {
		boolean isDeleted = false;
		
		try {
			if(isDirExists(dirName)) {
				isDeleted = dirName.delete();
			}
		} catch (SecurityException e) {
			logger.error("SecurityException while deleting a local directory: " + Utilities.getStackTrace( e ));
		} catch (Exception e1) {
			logger.error("Exception while deleting a local directory: " + Utilities.getStackTrace( e1 ));
		}
		
		return isDeleted;
	}
}
