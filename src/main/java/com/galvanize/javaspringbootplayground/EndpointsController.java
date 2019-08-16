package com.galvanize.javaspringbootplayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/")
    public String getIndex() {
        return "GET to index route";
    }

    @GetMapping("/math/pi")
    public String getMathIp() {
        return "3.141592653589793";
    }

}