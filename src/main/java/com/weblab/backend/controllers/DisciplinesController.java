package com.weblab.backend.controllers;

import com.weblab.backend.models.Disciplines;
import com.weblab.backend.repositories.DisciplinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("/api/disciplines")
public class DisciplinesController {
    private final DisciplinesRepository disciplinesRepository;

    @Autowired
    public DisciplinesController(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

    @GetMapping("/all")
    public Iterable<Disciplines> getAllDisciplines(){
        return disciplinesRepository.findAll();
    }
}
