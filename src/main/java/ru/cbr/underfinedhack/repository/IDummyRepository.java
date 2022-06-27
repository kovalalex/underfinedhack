package ru.cbr.underfinedhack.repository;

import ru.cbr.underfinedhack.entity.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDummyRepository extends JpaRepository<DummyEntity, Long> {
}
