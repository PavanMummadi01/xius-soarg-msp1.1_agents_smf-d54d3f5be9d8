package com.xius.smf.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.xius.smf.exceptions.SMFAgentException;

import io.micrometer.core.instrument.MeterRegistry;

@Aspect
@Component
public class SoapMetricsInterceptor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SoapMetricsInterceptor.class);
    private final MeterRegistry meterRegistry;

    public SoapMetricsInterceptor(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

//    @Around("execution(* com.xius.selfcare.*.*(..))")
//    public Object measureSoapMethodPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        String className = joinPoint.getTarget().getClass().getSimpleName();
//        
//     // Total method invocations counter
//        meterRegistry.counter("soap_service_calls_total", 
//            "method", methodName,
//            "class", className
//        ).increment();
//
//        // Timer to measure method execution time
//        return meterRegistry.timer("soap_service_method_duration", 
//            "method", methodName,
//            "class", className
//        ).record(() -> {
//            try {
//                return joinPoint.proceed();
//            }
//            catch (Throwable e) {
//                // Error counter
//                meterRegistry.counter("soap_service_errors_total", 
//                    "method", methodName,
//                    "class", className,
//                    "exception", e.getClass().getSimpleName()
//                ).increment();
//                throw new RuntimeException(e);
//            }
//        });
//    }
    
    
    @Around("execution(* com.xius.selfcare.*.*(..))")
    public Object measureSoapMethodPerformance(ProceedingJoinPoint joinPoint) throws SMFAgentException {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        
        LOGGER.info("Starting execution of {}.{}", className, methodName);
        
        try {
            // Total method invocations counter
            meterRegistry.counter("soap_service_calls_total", 
                "method", methodName,
                "class", className
            ).increment();

            Object result = joinPoint.proceed();
            
            // Record successful execution time
            meterRegistry.timer("soap_service_method_duration", 
                "method", methodName,
                "class", className
            ).record(() -> {
                LOGGER.info("Successfully completed {}.{}", className, methodName);
            });
            
            return result;
            
        } catch (SMFAgentException e) {
            //LOGGER.error("SelfCareAPPException in {}.{}: ", className, methodName, e);
            meterRegistry.counter("soap_service_SelfCareAPPExceptions_total", 
                    "method", methodName,
                    "class", className,
                    "exception", e.getClass().getSimpleName()
                ).increment();
        	
            throw e;  // Re-throw the original exception
            
        } catch (Throwable e) {
            LOGGER.error("Error in {}.{}: ", className, methodName, e);
            
            // Record error metrics
            meterRegistry.counter("soap_service_errors_total", 
                "method", methodName,
                "class", className,
                "exception", e.getClass().getSimpleName()
            ).increment();
            
            throw new RuntimeException("Error executing " + className + "." + methodName, e);
        }
    }
}