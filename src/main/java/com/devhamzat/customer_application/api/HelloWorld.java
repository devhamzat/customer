package com.devhamzat.customer_application.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
//    @RequestMapping(value = "/hello")
    @GetMapping("/hello")
     public String sayHello(){
         return "Hello world";
     }
}
