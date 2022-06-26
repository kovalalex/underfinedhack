package ru.cbr.underfinedhack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cbr.underfinedhack.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
