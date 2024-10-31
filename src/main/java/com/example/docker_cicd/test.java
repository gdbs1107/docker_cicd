package com.example.docker_cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class test {

    private final TestReposi testReposi;

    @GetMapping("/")
    public String index() {
        return "hello12";
    }

    @PostMapping("/")
    public void post(TestEntity test){
        testReposi.save(test);
    }
}
