package com.emploee.swagger.controller;

import com.emploee.swagger.entity.Employee;
import com.emploee.swagger.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/request")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/getData")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getData();
    }

    @PostMapping(value = "/insertData")
    public Employee insertEmployeeDetails(@RequestBody Employee employee){
        return employeeService.insertData(employee);
    }

    @DeleteMapping(value = "/deleteData")
    public void deleteEmployeeDetails(@RequestParam int id){
        employeeService.deleteData(id);
    }

}
