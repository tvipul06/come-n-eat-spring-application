package com.comeeat.controller;

import com.comeeat.bean.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/")
    public ResponseEntity<Response> getHomePage(){
        Response response = new Response();
        response.setMessage("Welcome To Come-n-Eat");
        response.setStatus(Boolean.TRUE);
        response.setStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<Response>(response,new HttpHeaders(), HttpStatus.OK);
    }
}
