package com.weblab.backend.controllers;


import com.weblab.backend.models.FacultyModel;
import com.weblab.backend.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("/api/faculties")
public class FacultiesController {

    private final FacultyService facultyService;

    @Autowired
    public FacultiesController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("")
    public List<FacultyModel> getAllFaculties() {
        return facultyService.getAll();
    }

    @PostMapping("")
    public void addFaculty(@RequestBody FacultyModel newFaculty) {
        facultyService.add(newFaculty);
    }

    @PutMapping("{id}")
    public void updateFaculty(@RequestBody FacultyModel newFaculty, @PathVariable Long id) {
       facultyService.update(newFaculty, id);
    }

    @DeleteMapping("{id}")
    void deleteFaculty( @PathVariable Long id) {
        facultyService.deleteById(id);
    }

}
