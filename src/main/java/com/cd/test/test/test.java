package com.cd.test.test;

import com.cd.test.TestApplication;
import org.springframework.boot.SpringApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class test {

    public static void main(String[] args) {
        try {
            SpringApplication.run(TestApplication.class, args);
            System.out.println("Application start done!");
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

}
