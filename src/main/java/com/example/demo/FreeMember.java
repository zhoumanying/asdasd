package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
public class FreeMember {

    @RequestMapping("/index")
    public String index(Map<String,Object>map)
    {
        map.put("name","linxaowei");
        map.put("age","20");
        map.put("sex","0");
        map.put("money","12");
        return "index";
    }
}
