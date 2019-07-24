package com.hgf.serverconsul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by hgf
 * created time is 2019/7/23
 */
@RestController
public class HelloController {
    @GetMapping("/hi")
    public String hello() {
        return "hello world23";
    }
}
