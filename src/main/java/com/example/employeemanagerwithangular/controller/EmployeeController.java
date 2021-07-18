/*
 * Date : 7/17/2021
 * File Name: EmployeeContoller.Java
 *Author : Hamed
 *
 */

package com.example.employeemanagerwithangular.controller;

import com.example.employeemanagerwithangular.model.Employee;
import com.example.employeemanagerwithangular.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class Description :
 *
 * @author Hamed
 * @version 1.0 17 Jul 2021
 * @contact:
 */

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees=employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public  ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id)
    {
        Employee employee=employeeService.findEmployeeById(id);
        return  new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        Employee newEmployee=employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        Employee newEmployee=employeeService.updateEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id)
    {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }








}