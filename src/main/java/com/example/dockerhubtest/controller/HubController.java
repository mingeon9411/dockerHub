package com.example.dockerhubtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HubController {

    @GetMapping("/")
    public String main() {
        return "root";
    }
}
