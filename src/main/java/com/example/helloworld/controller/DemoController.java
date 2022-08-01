package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author haowen.chen
 * @Date 2022/8/1
 */
@RestController
@RequestMapping("/demo")
public class DemoController {


    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return "hello world " + str;
    }
}
