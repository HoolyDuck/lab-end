package com.weblab.backend.services;

import com.weblab.backend.entities.Teachers;
import com.weblab.backend.mappers.TeacherMapper;
import com.weblab.backend.models.TeacherModel;
import com.weblab.backend.models.TeacherSelectModel;
import com.weblab.backend.repositories.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    private final TeachersRepository teachersRepository;

    @Autowired
    public TeacherService(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    public List<TeacherModel> select_teachers(){
        List<TeacherModel> teacherModels = new ArrayList<>();
        teachersRepository.findAll().forEach(teachers ->
            teacherModels.add(TeacherMapper.toModel(teachers))
        );
        return teacherModels;
    }

    public void update_teacher(TeacherModel insertTeacher, Long id) {
        Teachers newTeacher = TeacherMapper.toEntity(insertTeacher);
        teachersRepository.findById(id)
                .map(teacher -> {
                    teacher.setName(newTeacher.getName());
                    teacher.setSurname(newTeacher.getSurname());
                    teacher.setDepartment(newTeacher.getDepartment());
                    return teachersRepository.save(teacher);
                })
                .orElseGet(() -> {
                    newTeacher.setId(id);
                    return teachersRepository.save(newTeacher);
                });
    }

    public void insert_teacher(TeacherModel newTeacher) {
        teachersRepository.save(TeacherMapper.toEntity(newTeacher));
    }

    public void delete_teacher(Long id) {
        teachersRepository.deleteById(id);
    }


    public List<TeacherSelectModel> getAllTeacherNames() {
        List<TeacherSelectModel> teacherSelectModels = new ArrayList<>();

        teachersRepository.findAll().forEach(teachers -> teacherSelectModels.add(TeacherSelectModel.builder()
                .id(teachers.getId())
                .nameSurname(teachers.getName() + " " + teachers.getSurname())
                .build()));
        return teacherSelectModels;
    }

}
