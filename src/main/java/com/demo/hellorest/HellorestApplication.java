package com.demo.hellorest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HellorestApplication {
	
    @RequestMapping("/hello")
    public String home() {
        return "Hello Docker World";
    }

	public static void main(String[] args) {
		SpringApplication.run(HellorestApplication.class, args);
	}

}
