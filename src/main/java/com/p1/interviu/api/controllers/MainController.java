package com.p1.interviu.api.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//CRUD = Create Read Update Delete

/*
* Get -> Read;
* Post -> Create;
* Put & Patch-> Update;
* Delete -> Delete;
* */

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/hello")
    public ResponseEntity<String> greet(@RequestParam(name = "name", required = false) String name){

        String owner = name == null ? "world" : name;


        return ResponseEntity.ok("Hello " + owner + ", from the Adapost Animale");
    }

    @GetMapping("/owner")
    public String greetOwner(){
        return "Hello owner!";
    }
}
