package com.restTemplate.Service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    @Autowired
    public ApiService(RestService restService, RestTemplate restTemplate) {
        this.restService = restService;
        this.restTemplate = restTemplate;
    }

    RestService restService;

    RestTemplate restTemplate;



    public ResponseEntity<?> getResponseEntity(String id){
        String url = "http://dp-user-growth-crud-staging.wynk.in/campaigns/splitPercentage/"+id+"?realm=WYNK_MUSIC";
        ResponseEntity response= restTemplate.getForEntity(url,String.class);
        System.out.println("responseType : "+ response.getClass());
        return response;
    }

}
