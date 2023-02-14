package com.tms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("@annotation(com.tms.aop.ExecutionTime)")
    public void pointCutExecutionTime() {
    }
    @Pointcut("@annotation(com.tms.aop.RaceTime)")
    public void pointCutRaceTime(){}

    @Around(value = "pointCutExecutionTime()")
    public Object runExecutionTime(ProceedingJoinPoint point) throws Throwable {
        double start = System.nanoTime();

            Object proceed = point.proceed();

        double end = System.nanoTime();
        double durations = end - start;
        System.out.println();
        System.out.println(proceed.getClass().getComponentType()+"**********");
        System.out.print("Method "+point.getSignature().getName()+": Execution Time "+ String.format(("%.2f"),durations/1000000000)+" second");
        return durations;
    }

    @AfterReturning(value = "pointCutRaceTime()",returning = "time")
    public void info(Object time) {
        System.out.println();
        System.out.println("Durations " +time.toString() );
    }
}
