package com.weblab.backend.controllers;

import com.weblab.backend.models.DepartmentModel;
import com.weblab.backend.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentsController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("")
    public List<DepartmentModel> getAllDepartments() {
        return departmentService.getAll();
    }

    @PostMapping("")
    public void addDepartment(@RequestBody DepartmentModel newDepartment) {
        departmentService.add(newDepartment);
    }

    @PutMapping("{id}")
    public void replaceDepartment(@RequestBody DepartmentModel newDepartment, @PathVariable Long id) {
        departmentService.update(newDepartment, id);
    }

    @DeleteMapping("{id}")
    void deleteDepartment(@PathVariable Long id) {
        departmentService.delete(id);
    }


}
