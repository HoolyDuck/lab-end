package com.weblab.backend.controllers;

import com.weblab.backend.models.Departments;
import com.weblab.backend.models.Teachers;
import com.weblab.backend.repositories.DepartmentsRepository;
import com.weblab.backend.repositories.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("api/teachers")
public class TeacherController {

    private final TeachersRepository teachersRepository;
    @Autowired
    private DepartmentsRepository departmentsRepository;
    @Autowired
    public TeacherController(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    @GetMapping("/select_teachers")
    public Iterable<Teachers> select_teachers(){
        return teachersRepository.findAll();
    }
    @PostMapping("insert_teachers")
    public void insert_teachers(@RequestParam(name = "name") String name,
                                @RequestParam(name = "surnname") String surname,
                                @RequestParam(name = "department_id") long department_id
    ){
        Teachers teacher = Teachers.builder()
                .name(name)
                .surname(surname)
                .department(new Departments(departmentsRepository.findById(department_id)))
                .build();
        teachersRepository.save(teacher);
    }
}
