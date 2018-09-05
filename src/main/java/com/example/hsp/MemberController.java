package com.example.hsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberService m;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${lin}")
    private String lin;
    @RequestMapping("/member")
    @ResponseBody
    public String member()
    {
        log.info("1");
        m.member();
        log.info("4");
        return "123";
    }
    @RequestMapping("/qq")
    @ResponseBody
    public String qq()
    {
        return name+" "+age;
    }
    @RequestMapping("/lin")
    @ResponseBody
    public String lin()
    {
        return lin;
    }
}
