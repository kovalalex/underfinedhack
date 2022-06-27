package ru.cbr.underfinedhack.entity;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.cbr.underfinedhack.repository.EmployeeRepository;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;

    @Value("${data.generation.enabled:true}")
    private boolean generateData;

    @Override
    public void run(String... args) throws Exception {
        if (generateData) {
            log.info("data generation started...");
//            Employee testEmployee = new Employee();
//            testEmployee.setEmail("2@2.ru");
//            testEmployee.setFio("testfio");
//            employeeRepository.save(testEmployee);
        }
    }
}
