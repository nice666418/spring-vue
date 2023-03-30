package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(value = "com.example.common.entity")
public class TeacherApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class,args);
    }
}

