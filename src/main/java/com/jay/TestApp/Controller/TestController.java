package com.jay.TestApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    BuildProperties buildProperties;

    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")
    public String welcome(){
        return "{\"message\":\"Welcome to " + buildProperties.getArtifact() + "\",\"version\":\"" + buildProperties.getVersion() + "\"}";
    }

    @GetMapping(value = "/test", produces = "application/json; charset=UTF-8")
    public String getTest(){
        return "Hello, welcome to test application";
    }
}
