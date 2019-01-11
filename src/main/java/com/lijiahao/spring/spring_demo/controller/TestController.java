package com.lijiahao.spring.spring_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class TestController {
    @RequestMapping("/test")
    public String index(){
        return "test weixinxiaochengxu";
    }
}
