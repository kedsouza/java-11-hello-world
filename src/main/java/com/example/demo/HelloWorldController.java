package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;




@RestController  
public class HelloWorldController   
{  
    @RequestMapping("/")  
    public ResponseEntity hello()   
    {  
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        //return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);  
    }  

    @RequestMapping("/warmup")  
    public String warmup()   
    {  
        return "Success!";
    }  
}  