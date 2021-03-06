/*
 * Date : 7/17/2021
 * File Name: EmployeeService.Java
 *Author : Hamed
 *
 */

package com.example.employeemanagerwithangular.services;

import com.example.employeemanagerwithangular.exeptions.UserNotFoundException;
import com.example.employeemanagerwithangular.model.Employee;
import com.example.employeemanagerwithangular.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Class Description :
 *
 * @author Hamed
 * @version 1.0 17 Jul 2021
 * @contact:
 */

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public  Employee updateEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }


    public Employee findEmployeeById(Long id)
    {
        return employeeRepository.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found.") );
    }

    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteEmployeeById(id);
    }




}
