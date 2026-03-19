package com.example.dockerimagepractice.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {


    @GetMapping("call")
     public String hello()
     {
          return "Wellcom to docker image practice";
     }
}
