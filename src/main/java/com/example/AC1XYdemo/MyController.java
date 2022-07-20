package com.example.AC1XYdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController{
   
   @GetMapping("/hello")
   public String showIndex()
   {
	   System.out.println("IN  showIndex()");
                  return "index";
   }
}
