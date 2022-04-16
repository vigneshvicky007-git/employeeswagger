package com.emploee.swagger.service;

import com.emploee.swagger.entity.Employee;
import com.emploee.swagger.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getData(){
        return employeeRepository.findAll();
    }

    public Employee insertData(Employee student){
        employeeRepository.save(student);
        return student;
    }

    public void deleteData(int id){
        employeeRepository.deleteById(id);

    }
}
