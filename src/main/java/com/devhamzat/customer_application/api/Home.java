package com.devhamzat.customer_application.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
public class Home {

    @GetMapping
   public String home(){
        return "Application works " + new Date();
   }
}
