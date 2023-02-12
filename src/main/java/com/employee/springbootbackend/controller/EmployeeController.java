package com.employee.springbootbackend.controller;

import com.employee.springbootbackend.model.Employee;
import com.employee.springbootbackend.service.EmployeeService;
import com.employee.springbootbackend.service.EmployeeServiceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp employeeServiceImp;

    @PostMapping("/saveemployee")
    public Employee saveEmployee(@RequestBody @Valid Employee employee) {
        return employeeServiceImp.saveEmployee(employee);
    }

    @GetMapping("/gatemployee")
    public List<Employee> getEmployee(){
        return employeeServiceImp.getEmployee();

    }

    @GetMapping("/gatemployee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeid){
        return employeeServiceImp.getEmployeeById(employeeid);
    }

    @PutMapping("/updateemployee/{id}")
    public Employee updateEmployeeById(@RequestBody @Valid Employee employee,@PathVariable("id") Long employeeid){

        return employeeServiceImp.upadeteEmployee(employeeid,employee);
    }


    @DeleteMapping("/employeedelete/{id}")
    public void deleteEmployeeByID(@PathVariable("id") Long id) {
         employeeServiceImp.deleteEmployeeByID(id);



    }


}
