package com.weblab.backend.controllers;


import com.weblab.backend.models.Faculties;
import com.weblab.backend.repositories.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
@RequestMapping("/api/faculties")
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

    @PostMapping("")
    public Faculties addFaculty(@RequestBody Faculties newFaculty) {
        return facultiesRepository.save(newFaculty);
    }

    @PutMapping("{id}")
    public Faculties replaceFaculty(@RequestBody Faculties newFaculty, @PathVariable Long id) {
        return facultiesRepository.findById(id)
                .map(faculty -> {
                    faculty.setName(newFaculty.getName());
                    faculty.setUniversity(newFaculty.getUniversity());
                    return facultiesRepository.save(faculty);
                })
                .orElseGet(() -> {
                    newFaculty.setId(id);
                    return facultiesRepository.save(newFaculty);
                });
    }

    @DeleteMapping("{id}")
    void deleteFaculty( @PathVariable Long id) {
        facultiesRepository.deleteById(id);
    }

}
