package com.tcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.tcs.entity.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee, Integer>{

}
