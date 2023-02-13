package com.tms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("@annotation(com.tms.aop.ExecutionTime)")
    public void pointCutExecutionTime() {
    }

    ;

//    @Around(value = "pointCutExecutionTime()")
//    public Object runExecutionTime(ProceedingJoinPoint point) {
//        start = System.currentTimeMillis();
//        try {
//            Object proceed = point.proceed();
//            end = System.currentTimeMillis();
//            durations = end - start;
//            return proceed;
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//    }

    @AfterReturning(pointcut = "execution(* com.tms.HorseRacing.oneXBet(*))", returning = "result")
    public void info(JoinPoint joinPoint, Object result) {
        System.out.println("Durations " + joinPoint.getSignature().getName() + " = " + result.toString());
    }
}
