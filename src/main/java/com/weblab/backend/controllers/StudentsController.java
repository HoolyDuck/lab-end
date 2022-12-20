package com.weblab.backend.controllers;

import com.weblab.backend.models.StudentModel;
import com.weblab.backend.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentsController {

    private final StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<StudentModel> getAllStudents() {
        return studentService.getAll();
    }

    @PostMapping("")
    public void addStudent(@Valid @RequestBody StudentModel newStudent) {
        studentService.add(newStudent);
    }

    @PutMapping("{id}")
    public void updateStudent(@Valid @RequestBody StudentModel newStudent, @PathVariable Long id) {
        studentService.update(newStudent, id);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }


}
