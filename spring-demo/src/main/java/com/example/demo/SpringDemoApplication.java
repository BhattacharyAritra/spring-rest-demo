package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDemoApplication {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDB() {
		return (args) ->{
			this.employeeRepository.save(new Employee("","", ""));
			this.employeeRepository.save(new Employee("", "", ""));
			this.employeeRepository.save(new Employee("", "", ""));
			this.employeeRepository.save(new Employee("", "", ""));		
			
		};
		
	}
}
