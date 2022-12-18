package com.weblab.backend.services;


import com.weblab.backend.mappers.FacultyMapper;
import com.weblab.backend.models.FacultyModel;
import com.weblab.backend.repositories.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyService {

    FacultiesRepository facultiesRepository;

    @Autowired
    public FacultyService(FacultiesRepository facultiesRepository) {
        this.facultiesRepository = facultiesRepository;
    }


    public List<FacultyModel> getAll() {
        List<FacultyModel> facultyModels = new ArrayList<>();
        facultiesRepository.findAll().forEach(faculties ->
                facultyModels.add(FacultyMapper.toModel(faculties)));
        return facultyModels;
    }

    public void add(FacultyModel facultyModel) {
        facultiesRepository.save(FacultyMapper.toEntity(facultyModel));
    }

    public void update(FacultyModel facultyModel, Long id) {
        facultiesRepository.findById(id).map(faculty -> {
                    faculty.setName(facultyModel.getName());
                    faculty.setShortName(facultyModel.getShortName());
                    return facultiesRepository.save(faculty);
                })
                .orElseGet(() -> {
                    facultyModel.setId(id);
                    return facultiesRepository.save(
                            FacultyMapper.toEntity(facultyModel));
                });
    }

    public void deleteById(Long id) {
        facultiesRepository.deleteById(id);
    }


}
