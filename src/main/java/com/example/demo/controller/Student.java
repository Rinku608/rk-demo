package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Student {
	
	
@RequestMapping("/")
	   public String hello() {
	        return "Hello student, rinku!";
	    }

@RequestMapping("/student")
public String welcome() {
     return "Welcome student in spring boot world!";
 }

}
