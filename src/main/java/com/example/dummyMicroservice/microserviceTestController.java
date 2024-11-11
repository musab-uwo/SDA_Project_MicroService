package com.example.dummyMicroservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class microserviceTestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Microservice test!";
    }
}
