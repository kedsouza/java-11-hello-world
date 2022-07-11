package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.concurrent.TimeUnit;

@RestController  
public class HelloWorldController   
{  
    @RequestMapping("/")  
    public ResponseEntity hello()   
    {  
         try
        {
            TimeUnit.SECONDS.sleep(30);
        }
        catch(InterruptedException ex)
        {
            System.out.println("Your message here");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        //return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);  
    }  

    @RequestMapping("/warmup")  
    public String warmup()   
    {  
        try
        {
            TimeUnit.SECONDS.sleep(30);
        }
        catch(InterruptedException ex)
        {
            System.out.println("Your message here");
        }
        return "Success!";
    }  
}  