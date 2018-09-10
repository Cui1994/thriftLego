package com.cui1994.lego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LegoApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(LegoApplication.class, args);
    }
}
