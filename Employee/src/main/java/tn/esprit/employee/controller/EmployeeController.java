package tn.esprit.employee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.employee.entity.Employee;
import tn.esprit.employee.service.EmployeeService;



@RestController
@RequestMapping(value="/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Employee> createCondidat(@RequestBody Employee employee){
        log.info("inside adduser methode");
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
    }
}
