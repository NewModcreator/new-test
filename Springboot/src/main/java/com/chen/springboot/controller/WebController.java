package com.chen.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/weather")
    public String weather(){
        return"天气晴，23摄氏度";
    }
}
