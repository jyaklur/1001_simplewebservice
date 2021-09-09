package com.yaklur.webservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @GetMapping("/")
    public String getmapping(){
        return "your Restful webservice is up and running";
    }

    @GetMapping("/home")
    public String home(){
        return "Welcome! you are in the homepage";
    }

    @GetMapping("/employee/{id}")
    public String getcall(@PathVariable int id ){
        return "Retrieving EMPLOYEE ID# "+id ;
    }

    @PostMapping("/")
    public String postmapping(){
        return "This is your default POST no params passed";
    }

    @PostMapping("/postcall")
    public String postcall(){
        return "This is your POSTCALL no params passed";
    }

    @PostMapping("/employee/{id}")
    public String postcall(@PathVariable int id ){
        return "Welcome to EMPLOYEE ID# "+id;
    }

    @PutMapping("/")
    public String putmapping(){
        return "This is your default PUT no params passed";
    }

    @PatchMapping("/")
    public String patchmapping(){
        return "This is your default PATCH no params passed";
    }

    @DeleteMapping("/")
    public String deletemapping(){
        return "This is your default DELETE no params passed";
    }

}
