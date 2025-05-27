package com.xius.smf.log;

import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class SoapMetricsConfig {
    @Bean
    public MeterRegistryCustomizer<MeterRegistry> customizeMetrics() {
        return registry -> registry.config()
            .commonTags("application", "soap-service",
                         "environment", "production");
    }
}
