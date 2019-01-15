package com.lee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BeetlSqlApplication {
    @RequestMapping("/test")
    public Object test(){
        return "123";
    }
    public static void main(String[] args) {
        SpringApplication.run(BeetlSqlApplication.class, args);
    }

}

