package com.weblab.backend.services;


import com.weblab.backend.entities.Faculties;
import com.weblab.backend.mappers.DepartmentMapper;
import com.weblab.backend.models.DepartmentModel;
import com.weblab.backend.repositories.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentsRepository departmentsRepository;

    @Autowired
    public DepartmentService(DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }

    public List<DepartmentModel> getAll() {
        List<DepartmentModel> departmentModels = new ArrayList<>();
        departmentsRepository.findAll().forEach(departments ->
                departmentModels.add(DepartmentMapper.toModel(departments)));
        return departmentModels;
    }

    public void add(DepartmentModel departmentModel) {
        departmentsRepository.save(DepartmentMapper.toEntity(departmentModel));
    }

    public void update(DepartmentModel departmentModel, Long id) {
        departmentsRepository.findById(id).map(faculty -> {
                    faculty.setName(departmentModel.getName());
                    faculty.setShortName(departmentModel.getShortName());
                    faculty.setFaculty(Faculties.builder()
                            .id(departmentModel.getFacultyId())
                            .build());
                    return departmentsRepository.save(faculty);
                })
                .orElseGet(() -> {
                    departmentModel.setId(id);
                    return departmentsRepository.save(
                            DepartmentMapper.toEntity(departmentModel));
                });
    }

    public void delete(Long id) {
        departmentsRepository.deleteById(id);
    }
}
