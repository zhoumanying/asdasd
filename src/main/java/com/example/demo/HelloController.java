package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value="/hello")
    public String hello()
    {
        return "helloworld";
    }
    @RequestMapping("/say")
    public String say(String name,String age)
    {
        return name+" "+age;
    }
}
