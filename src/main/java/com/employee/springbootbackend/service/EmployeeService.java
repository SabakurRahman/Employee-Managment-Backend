package com.employee.springbootbackend.service;

import com.employee.springbootbackend.model.Employee;

import java.util.List;


public interface EmployeeService {
 public Employee saveEmployee(Employee employee);
 public List<Employee> getEmployee();
 public Employee getEmployeeById(Long id);
 public Employee upadeteEmployee(Long id, Employee employee);
 public void deleteEmployeeByID(Long id);


}
