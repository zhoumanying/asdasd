package com.example.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = {"com.example.test"})
public class RunError {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> Result()
    {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("errorCode","500");
        map.put("errorResult","系统错误");
        return map;
    }
}
