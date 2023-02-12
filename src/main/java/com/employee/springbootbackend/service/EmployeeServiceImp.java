package com.employee.springbootbackend.service;

import com.employee.springbootbackend.model.Employee;
import com.employee.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }


    @Override
    public Employee upadeteEmployee(Long id, Employee employee) {
       Employee employee1= employeeRepository.findById(id).get();
       if(Objects.nonNull(employee.getFrist_name())){
           employee1.setFrist_name(employee.getFrist_name());
       }
       if(Objects.nonNull(employee.getLast_name())){
           employee1.setLast_name(employee.getLast_name());
       }
       if(Objects.nonNull(employee.getEmail_id())){
           employee1.setEmail_id(employee.getEmail_id());
       }

        return employeeRepository.save(employee1);
    }

    @Override
    public void deleteEmployeeByID(Long id) {
        employeeRepository.deleteById(id);

    }
}
