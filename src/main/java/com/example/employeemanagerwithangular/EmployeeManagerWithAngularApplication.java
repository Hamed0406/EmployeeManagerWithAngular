package com.example.employeemanagerwithangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

@SpringBootApplication
public class EmployeeManagerWithAngularApplication {


   @RequestMapping("/")
 
    @ResponseBody
    String home() {
        return "Employee API for ANGULAR ";
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagerWithAngularApplication.class, args);
    }

}
