package com.hgf.serverconsul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by hgf
 * created time is 2019/7/23
 */
@RestController
public class HelloController {
    @RequestMapping("/hi")
    public String hello() {
        return "hello world23";
    }
}
