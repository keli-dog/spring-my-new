package com.itheima.aop;

import com.itheima.domain.Love;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect//自动实现
public class MyAdvice {
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void pt() {
    }

    /*@Before("pt()")//前置通知
    public void method1(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();// 获取参数
        System.out.println("--------------before--------------"+Arrays.toString(args));

    }

    @After("pt()")//后置通知
    public void method2(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();// 获取参数
        System.out.println("---------------after--------------"+Arrays.toString(args));
    }*/
/*当要增强的函数有返回值时通知函数定义为object
通过ProceedingJoinPoint的proceed函数调用原始操作
并将返回值接收，由通知函数返回*/
    @Around("pt()")//环绕通知
    public Object method3(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        if (args.length != 0&&args[0] instanceof Love) {
            // 参数转换
            Love account = (Love) args[0];
            account.setName(account.getName().trim());
        }
        System.out.println("--------------before--------------");
        System.out.println(pjp.getSignature().getDeclaringType()+
                "的方法"+pjp.getSignature().getName());
        Object proceed = pjp.proceed();// 获取返回值
        System.out.println("---------------after--------------");
        return proceed;
    }

    /*@AfterReturning(value = "pt()",returning = "ret")// 正常返回以后运行
    public void method4(Object ret) {//形参为接收返回值
        System.out.println("--------AfterReturning-------------"+ret);
    }

    @AfterThrowing(value="pt()",throwing = "throwing")// 异常出现以后运行
    public void method5(Throwable throwing) {//形参为接收异常对象
        System.out.println("-------AfterThrowing--------------"+throwing);

    }*/
}
