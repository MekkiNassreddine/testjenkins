package tn.esprit.employee.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.employee.entity.Employee;
import tn.esprit.employee.repository.EmployeeRepository;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        log.info("inside servece methode add");
        employeeRepository.save(employee);
        return employee;
    }
}
