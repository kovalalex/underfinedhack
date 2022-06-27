package ru.cbr.underfinedhack.controller;

import ru.cbr.underfinedhack.entity.DummyEntity;
import ru.cbr.underfinedhack.service.IDummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dummy")
public class DummyController {

    @Autowired
    private IDummyService dummyService;

    @PostMapping
    public ResponseEntity saveProduct(@RequestBody DummyEntity dummyEntity){
        return new ResponseEntity(dummyService.saveDummyEntity(dummyEntity), HttpStatus.CREATED);
    }
}
