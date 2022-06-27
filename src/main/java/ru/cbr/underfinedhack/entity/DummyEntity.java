package ru.cbr.underfinedhack.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class DummyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 10, nullable = false)
    private String name;
}
