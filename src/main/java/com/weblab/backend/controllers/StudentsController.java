package com.weblab.backend.controllers;

import com.weblab.backend.entities.Students;
import com.weblab.backend.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("api/students")
public class StudentsController {
    private final StudentsRepository studentsRepository;

    @Autowired
    public StudentsController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("")
    public Iterable<Students> getAllStudents(){
        return studentsRepository.findAll();
    }

    @PostMapping("")
    public Students addStudent(@RequestBody Students newStudent){
        return studentsRepository.save(newStudent);
    }

    @PutMapping("{id}")
    public Students updateStudent(@RequestBody Students newStudent, @PathVariable Long id){
        return studentsRepository.findById(id).
                map(student -> {
                    student.setName(newStudent.getName());
                    student.setEmail(newStudent.getEmail());
                    student.setPhone(newStudent.getPhone());
                    student.setGroup(newStudent.getGroup());
                    return studentsRepository.save(student);
                })
                .orElseGet(() ->{
                    newStudent.setId(id);
                    return studentsRepository.save(newStudent);
                });
    }
    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentsRepository.deleteById(id);

    }




}
