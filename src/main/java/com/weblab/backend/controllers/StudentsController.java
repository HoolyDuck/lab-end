package com.weblab.backend.controllers;

import com.weblab.backend.entities.Students;
import com.weblab.backend.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("api/students")
public class StudentsController {
    private final StudentsRepository studentsRepository;

    @Autowired
    public StudentsController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("/all")
    public Iterable<Students> getAllStudents(){
        return studentsRepository.findAll();
    }
}
