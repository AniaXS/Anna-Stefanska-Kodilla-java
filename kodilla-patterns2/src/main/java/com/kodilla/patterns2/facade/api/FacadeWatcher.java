package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && args(object, theNumber)")
    public void logEvent(Object object, Long theNumber) {
        LOGGER.info("Method processOrder() has been called for arguments: " + object.getClass().getSimpleName() + " and " + theNumber);
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            Instant start = Instant.now();
            result = proceedingJoinPoint.proceed();
            Instant finish = Instant.now();
            LOGGER.info("Time consumed: " + Duration.between(start, finish).toNanos() + " ns");
        } catch (Throwable throwable) {
            LOGGER.error("Time measurement was interrupted by an error: " + throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
