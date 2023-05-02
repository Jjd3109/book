package com.example.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping(value="/test123")
    public ResponseEntity test(){
        String test = "테스트";
        String test2 = "테스트3";

        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("1", test);
        testMap.put("2", test2);


        return new ResponseEntity<>(testMap, HttpStatus.OK);
    }

    @GetMapping("/index")
    public String index(){

        return "index";
    }

}
