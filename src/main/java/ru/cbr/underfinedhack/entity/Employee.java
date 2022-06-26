package ru.cbr.underfinedhack.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fio;
    private String email;

}
