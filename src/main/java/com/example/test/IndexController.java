package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/gg")
    public String index(int i)
    {
        int c = 10/i;
        return "success";
    }
}
