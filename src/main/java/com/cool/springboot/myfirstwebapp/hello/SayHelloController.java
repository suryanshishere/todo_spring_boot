package com.cool.springboot.myfirstwebapp.hello;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class SayHelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    // @GetMapping("/hello-html")
    // @ResponseBody
    // public String sayHelloHtml() {
    // try {
    // return new String(
    // Files.readAllBytes(Paths.get("src/main/java/com/cool/springboot/myfirstwebapp/hello/hello.html")));
    // } catch (IOException e) {
    // e.printStackTrace();
    // return "Error reading file: " + e.getMessage();
    // }
    // }

    @GetMapping("hello-jsp")
    public String sayHelloJsp() {
        return "hello"; 
    }
}
