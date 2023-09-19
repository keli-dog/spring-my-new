//package com.itheima.aop;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class MyAdviceExample {
//    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
//    private void pt(){
//
//    }
//    @Around("pt()")
//    public Object method(ProceedingJoinPoint joinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//        Signature signature = joinPoint.getSignature();
//        //System.out.println(signature.getDeclaringTypeName());// 返回当前方法的名字
//        //System.out.println(signature.getName());// 被代理的对象
//        for(int i = 0; i < 10000; i++){
//            joinPoint.proceed();
//        }
//        Object proceed = joinPoint.proceed();
//        long  over= System.currentTimeMillis();
//        System.out.println(signature.getName()+"执行时间为"+(over- start)+"毫秒");
//        return proceed;
//    }
//}
