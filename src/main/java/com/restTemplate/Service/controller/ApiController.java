package com.restTemplate.Service.controller;

import com.restTemplate.Service.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    ApiService apiService;

    @GetMapping("/campaign")
    public ResponseEntity<?> campaignsApi(@RequestParam("id") String id){
        System.out.println("Api is hit : "+id);
        return apiService.getResponseEntity(id);
    }
}
