package com.itheima.controller.ExceptionController;

import com.itheima.controller.ResultController.CodeStatus;
import com.itheima.controller.ResultController.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//异常处理器类
@RestControllerAdvice// 上下文异常
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)// 处理服务端异常
    public Result doSystemException(Exception e){
        System.out.println("出现系统异常了");
        return new Result(null, CodeStatus.SYS_ERROR.getCode(),"系统异常，请稍后再试");
    }
        
    
}
