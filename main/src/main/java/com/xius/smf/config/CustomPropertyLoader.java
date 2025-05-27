package com.xius.smf.config;

import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CustomPropertyLoader implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, org.springframework.boot.SpringApplication application) {
        String propertyFilePath = "./conf/smfagent.properties";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(propertyFilePath));

            // Debugging: Print all properties
            // properties.forEach((key, value) -> System.out.println(key + "=" + value));

            // Add properties to the environment
            PropertiesPropertySource propertySource = new PropertiesPropertySource("externalProperties", properties);
            environment.getPropertySources().addLast(propertySource);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load external properties: " + e.getMessage());
        }
    }
}

