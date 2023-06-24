package com.cloud.gcpdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class GCPController {

    @GetMapping("helloworld")
    public String sayHelloWorld(){
        System.out.println( "Calling Hello World!");
        return "Hello World!";
    }

    @GetMapping("helloworld/{name}")
    public String sayHello(@PathVariable String name){
        System.out.println("Calling Hello World for "+name.toUpperCase());
        return "Hi, "+name.toUpperCase()+" welcome to the GCP World";
    }
}
