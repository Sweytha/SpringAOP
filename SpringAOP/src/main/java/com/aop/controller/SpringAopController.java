package com.aop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringAopController {
	
	 @GetMapping("/ping")
	    public ResponseEntity<String> ping(){

            System.out.println("Developer works on business logic and aspect takes care of cross cutting concerns!");
	        return new ResponseEntity<String>("Application up and running",HttpStatus.OK);

	    }

}
