package com.example.demo.Service;

import com.example.demo.Repository.EmpRepo;
import com.example.demo.controller.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepo repo;

    public void saveEmp(Employee emp){
        repo.save(emp);
    }
public List<Employee> getEmployees() {
        List<Employee> list = repo.findAll();
        return list;
}
}
