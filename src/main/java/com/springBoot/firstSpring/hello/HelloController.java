package com.springBoot.firstSpring.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    http://localhost:8080/hello
    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello World!");
    }

    //    http://localhost:8080/hello
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello "+name+"!");
    }
}
