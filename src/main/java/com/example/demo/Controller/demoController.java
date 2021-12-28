package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @RequestMapping("/")
    public String hello(){
        return "向全世界說聲Spring Boot 很高興認識你!";
    }
}
