package com.tcs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.entity.Employee;
import com.tcs.exception.IdNotFoundException;
import com.tcs.repository.EmployeeRepository;

@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner{

	
	@Autowired
	EmployeeRepository employeerepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
		System.out.println("daya base connected");
	}
	
	@Override
	public void run(String...args)throws Exception{
		
		//Employee employee = new Employee(1, "Goku", 04500.0, "HR", 22);
		
		//employeerepository.save(employee);
		
		List<Employee> employees = employeerepository.findAll();
		employees.forEach(System.out::println);
		
		try {
		Employee emp = employeerepository.findById(1).orElseThrow(()->new IdNotFoundException("id not found"));
		System.out.println(emp);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
