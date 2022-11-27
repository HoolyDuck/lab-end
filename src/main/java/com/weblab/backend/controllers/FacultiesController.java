package com.weblab.backend.controllers;


import com.weblab.backend.models.Faculties;
import com.weblab.backend.repositories.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/faculties")
public class FacultiesController {

    private final FacultiesRepository facultiesRepository;

    @Autowired
    public FacultiesController(FacultiesRepository facultiesRepository) {
        this.facultiesRepository = facultiesRepository;
    }

    @GetMapping("all")
    public Iterable<Faculties> getAllFaculties() {
        return facultiesRepository.findAll();
    }


}
