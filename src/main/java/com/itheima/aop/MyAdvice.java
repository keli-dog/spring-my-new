package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void pt(){

    }
    @Around("pt()")
    public Object method(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("--------------before--------------");
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long  over= System.currentTimeMillis();
        System.out.println(joinPoint.getSignature().getName()+"执行时间为"+(over- start)+"毫秒");
        System.out.println("---------------after--------------");
        return proceed;
    }
}
