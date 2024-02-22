package io.alamincsme;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AopAspect {

    Logger logger = LoggerFactory.getLogger(AopAspect.class);



//    @Before("execution(* AopClass+.*(..))")
    @Before("execution(* AopClass+.*(..))")
    public void before (JoinPoint joinPoint) {
        logger.info("Starting ..........."+ joinPoint.getSignature().getName() );
        logger.info("with parameter : " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* AopClass+.*(..))")
    public void after (JoinPoint joinPoint) {
        logger.info("..........fininshed...... : " + joinPoint.getSignature().getName());
    }
}