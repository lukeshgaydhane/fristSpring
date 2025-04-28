package com.springBoot.firstSpring.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    //    http://localhost:8080/hello
    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
        return "Hello"+name+"!";
    }
}
