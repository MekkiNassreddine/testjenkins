package tn.esprit.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.employee.entity.Employee;




public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
