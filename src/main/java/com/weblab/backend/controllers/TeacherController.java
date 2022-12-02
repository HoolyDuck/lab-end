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
    public TeacherController(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    @GetMapping("/all")
    public Iterable<Teachers> select_teachers(){
        return teachersRepository.findAll();
    }
    @PostMapping("/add")
    public Teachers insert_teacher(@RequestBody Teachers newTeacher) {
        return teachersRepository.save(newTeacher);
    }
    @PutMapping("/update/{id}")
    public Teachers update_teacher(@RequestBody Teachers newTeacher, @PathVariable Long id){
        return teachersRepository.findById(id)
                .map(teacher -> {
                    teacher.setName(newTeacher.getName());
                    teacher.setSurname(newTeacher.getSurname());
                    teacher.setDepartment(newTeacher.getDepartment());
                    return teachersRepository.save(teacher);
                })
                .orElseGet(() ->{
                    newTeacher.setId(id);
                    return teachersRepository.save(newTeacher);
                });
    }
    @DeleteMapping("/delete/{id}")
    public void delete_teacher(@PathVariable Long id){
        teachersRepository.deleteById(id);
    }
}
