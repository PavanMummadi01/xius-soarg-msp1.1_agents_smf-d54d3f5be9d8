package com.xius.smf.log;

import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;

@Component
public class SoapMetricsExporter {
    private final MeterRegistry meterRegistry;

    public SoapMetricsExporter(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    // Custom method to expose complex metrics
    public void recordSoapServiceMetrics(String serviceName, long processingTime, boolean isSuccess) {
        // Service call counter
        meterRegistry.counter("soap_service_calls", 
            "service", serviceName,
            "status", isSuccess ? "success" : "failure"
        ).increment();

        // Histogram for processing time
        meterRegistry.summary("soap_service_processing_time", 
            "service", serviceName
        ).record(processingTime);
    }
}
