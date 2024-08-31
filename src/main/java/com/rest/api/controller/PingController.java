package com.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class PingController {

    @GetMapping("server/status")
    public LocalDateTime getMessage() {
        return LocalDateTime.now();
    }
}
