package com.ps.dorm.typeHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/24 16:22
 */
@ControllerAdvice
public class Excption {
    @ExceptionHandler(Exception.class)
    public String handlerExcepton(Exception exception){
        return "/404.html";
    }
}
