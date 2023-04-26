package com.rodolfo.interceptor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> check() {
        System.out.println("Passed through the controller.");
        return new ResponseEntity<>("Is alive", HttpStatus.OK);
    }
}
