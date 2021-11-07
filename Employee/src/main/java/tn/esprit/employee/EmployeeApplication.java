package tn.esprit.employee;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.employee.entity.Employee;
import tn.esprit.employee.repository.EmployeeRepository;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }
    @Bean
    ApplicationRunner init(EmployeeRepository repository) {
        return args -> {
            Stream.of("Mariem", "Sarra", "Mohamed").forEach(name -> {
                repository.save(new Employee());
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
