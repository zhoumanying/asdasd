package com.example.hsp;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class User {
    private String name;
    private Integer age;
    public User()
    {

    }
    public static void main(String[] args)
    {
        User user = new User();
        user.setName("aasdasd");
        user.setAge(12);
        System.out.println(user.toString());
    }
}
