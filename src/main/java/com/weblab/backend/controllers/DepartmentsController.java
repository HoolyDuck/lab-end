package com.weblab.backend.controllers;

import com.weblab.backend.entities.Departments;
import com.weblab.backend.repositories.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("/api/departments")
public class DepartmentsController {
    private final DepartmentsRepository departmentsRepository;

    @Autowired
    public DepartmentsController(DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }

    @GetMapping("")
    public Iterable<Departments> getAllDepartments(){
        return departmentsRepository.findAll();
    }
    @PostMapping("")
    public Departments addDepartment(@RequestBody Departments newDepartment) {
        return departmentsRepository.save(newDepartment);
    }
    @PutMapping("{id}")
    public Departments replaceDepartment(@RequestBody Departments newDepartment, @PathVariable Long id) {
        return departmentsRepository.findById(id)
                .map(department -> {
                    department.setName(newDepartment.getName());
                    department.setShort_name(newDepartment.getShort_name());
                    department.setFaculty(newDepartment.getFaculty());
                    return departmentsRepository.save(department);
                })
                .orElseGet(() -> {
                    newDepartment.setId(id);
                    return departmentsRepository.save(newDepartment);
                });
    }

    @DeleteMapping("{id}")
    void deleteDepartment( @PathVariable Long id) {
        departmentsRepository.deleteById(id);
    }






}
