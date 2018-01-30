package com.securtity.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyi@stjf.com
 * @Date 1/30/2018 5:52 PM
 * @Vendor XMYY Information Technology Co.,Ltd.
 **/
@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello spring securtity";
    }
}
