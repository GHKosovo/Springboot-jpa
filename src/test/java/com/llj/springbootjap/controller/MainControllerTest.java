package com.llj.springbootjap.controller;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;



@RestController
class MainControllerTest {

    @RequestMapping("/homepage")
    public String Homepage(){
        return "HelloWorld!";
    }
}