package com.vldrospuskov.sneaky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello world";
    }

}
