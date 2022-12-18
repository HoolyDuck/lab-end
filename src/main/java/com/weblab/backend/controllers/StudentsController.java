package com.weblab.backend.controllers;

import com.weblab.backend.models.StudentModel;
import com.weblab.backend.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
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
    public void addStudent(@RequestBody StudentModel newStudent) {
        studentService.add(newStudent);
    }

    @PutMapping("{id}")
    public void updateStudent(@RequestBody StudentModel newStudent, @PathVariable Long id) {
        studentService.update(newStudent, id);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }


}
