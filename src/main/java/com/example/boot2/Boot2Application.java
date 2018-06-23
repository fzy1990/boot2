package com.example.boot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@SpringBootApplication
public class Boot2Application {

    public static void main(String[] args) {
        System.out.println(1);
        SpringApplication.run(Boot2Application.class, args);
    }
}
