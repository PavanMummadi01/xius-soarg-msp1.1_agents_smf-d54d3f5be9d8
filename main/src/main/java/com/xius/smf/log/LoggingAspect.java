package com.xius.smf.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.xius.smf.exceptions.SMFAgentException;

@Aspect
@Component
public class LoggingAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        String methodName = joinPoint.getSignature().getName();
        long endTime =0;
        try {
            Object result = joinPoint.proceed();
             endTime = System.currentTimeMillis();
             LOGGER.info("Method {} completed in {} ms", methodName, (endTime - startTime));
            return result;
        } catch (Exception e) {
        	 endTime = System.currentTimeMillis();
        	 LOGGER.error("Error executing {}: {}", methodName, e.getMessage(), e);
        	 
        	 Throwable cause = e.getCause();
             if (cause instanceof SMFAgentException) {
            	 SMFAgentException sMFAgentException = (SMFAgentException) cause;
                 LOGGER.error("Error in method {}: ErrorCode: {}, ErrorMessage: {}",
                         methodName,
                         sMFAgentException.getErrorCode(),
                         sMFAgentException.getErrorMessage());
                 
                 // Throw a new exception using Utilities.setSelfCareException()
                 throw new SMFAgentException(sMFAgentException.getErrorCode().toString(), sMFAgentException.getErrorMessage());
             } else {
                 LOGGER.error("Error in method {}: {}", methodName, e.getMessage(), e);
             }
             throw e;
        }

    }
}
