package com.example.hsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberService {

    @Async
    public void member()
    {
        log.info("2");
        log.info("3");
    }
}
