package ru.cbr.underfinedhack.service;

import ru.cbr.underfinedhack.entity.DummyEntity;
import ru.cbr.underfinedhack.repository.IDummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements IDummyService{

    @Autowired
    private IDummyRepository dummyRepository;

    @Override
    public DummyEntity saveDummyEntity(DummyEntity dummyEntity){
        return dummyRepository.save(dummyEntity);
    }

}
