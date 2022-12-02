package com.weblab.backend.controllers;


import com.weblab.backend.models.Faculties;
import com.weblab.backend.repositories.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("/api/faculties")
public class FacultiesController {

    private final FacultiesRepository facultiesRepository;

    @Autowired
    public FacultiesController(FacultiesRepository facultiesRepository) {
        this.facultiesRepository = facultiesRepository;
    }

    @GetMapping("/all")
    public Iterable<Faculties> getAllFaculties() {
        return facultiesRepository.findAll();
    }


}
