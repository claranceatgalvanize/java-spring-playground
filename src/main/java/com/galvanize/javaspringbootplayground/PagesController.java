package com.galvanize.javaspringbootplayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Clarance Farley";
    }

}