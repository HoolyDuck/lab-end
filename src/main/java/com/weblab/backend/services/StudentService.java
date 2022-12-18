package com.weblab.backend.services;

import com.weblab.backend.entities.Groups;
import com.weblab.backend.mappers.StudentMapper;
import com.weblab.backend.models.StudentModel;
import com.weblab.backend.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentsRepository studentsRepository;

    @Autowired
    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public List<StudentModel> getAll() {
        List<StudentModel> studentModels = new ArrayList<>();
        studentsRepository.findAll().forEach(students ->
                studentModels.add(StudentMapper.toModel(students)));
        return studentModels;
    }

    public void add(StudentModel newStudent) {
        studentsRepository.save(StudentMapper.toEntity(newStudent));
    }


    public void update(StudentModel newStudent, Long id) {
        studentsRepository.findById(id)
                .map(students -> {
                            students.setName(newStudent.getName());
                            students.setEmail(newStudent.getEmail());
                            students.setPhone(newStudent.getPhone());
                            students.setGroup(Groups.builder()
                                    .id(newStudent.getGroupId())
                                    .build());
                            return studentsRepository.save(students);
                        })
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return studentsRepository.save(StudentMapper.toEntity(newStudent));
                });
    }

    public void deleteById(Long id) {
        studentsRepository.deleteById(id);
    }

}

