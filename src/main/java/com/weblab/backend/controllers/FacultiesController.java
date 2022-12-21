package com.weblab.backend.controllers;


import com.weblab.backend.models.FacultyModel;
import com.weblab.backend.services.FacultyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
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
    public void addFaculty(@Valid @RequestBody FacultyModel newFaculty) {
        facultyService.add(newFaculty);
    }

    @PutMapping("{id}")
    public void updateFaculty(@Valid @RequestBody FacultyModel newFaculty, @PathVariable Long id) {
       facultyService.update(newFaculty, id);
    }

    @DeleteMapping("{id}")
    void deleteFaculty( @PathVariable Long id) {
        facultyService.deleteById(id);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<String> onMethodArgumentNotValidException(
            MethodArgumentNotValidException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
}
