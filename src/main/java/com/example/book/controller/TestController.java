package com.example.book.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value="/test")
    public ResponseEntity<String> test(){
        String test = "테스트";

        return ResponseEntity.ok(test);
    }

}
