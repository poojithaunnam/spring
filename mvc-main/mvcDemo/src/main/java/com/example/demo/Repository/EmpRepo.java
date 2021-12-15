package com.example.demo.Repository;

import com.example.demo.controller.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
//or @repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
