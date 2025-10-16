package com.jojocas.segunda_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jojocas.segunda_spring_app.domain.User;
import com.jojocas.segunda_spring_app.service.HelloWorldService;

@RestController
@RequestMapping("/hello-world")
public class HelloWolrdController {

    private final HelloWorldService helloWorldService;

    public HelloWolrdController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Joaquim");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body){
        return "Hello World " + body.getName() + id;
    }
}
