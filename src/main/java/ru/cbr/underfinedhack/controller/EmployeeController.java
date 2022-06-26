package ru.cbr.underfinedhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.cbr.underfinedhack.entity.Employee;
import ru.cbr.underfinedhack.repository.EmployeeRepository;

@RestController
@RequestMapping("/employers")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping(path = "/{id}")
    public ResponseEntity<Employee> oneEmployee(@PathVariable("id") Long id){
        return employeeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }
}
