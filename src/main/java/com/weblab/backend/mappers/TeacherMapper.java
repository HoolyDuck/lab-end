package com.weblab.backend.mappers;

import com.weblab.backend.entities.Departments;
import com.weblab.backend.entities.Teachers;
import com.weblab.backend.models.TeacherModel;

public class TeacherMapper {
    public static Teachers toEntity(TeacherModel teacherModel){
        return Teachers.builder()
                .name(teacherModel.getName())
                .email(teacherModel.getEmail())
                .surname(teacherModel.getSurname())
                .phone(teacherModel.getPhone())
                .department(Departments.builder()
                        .id(teacherModel.getDepartment())
                        .build())
                .build();
    }
    public static TeacherModel toModel(Teachers teacher){
        return TeacherModel.builder()
                .id(teacher.getId())
                .name(teacher.getName())
                .surname(teacher.getSurname())
                .email(teacher.getEmail())
                .phone(teacher.getPhone())
                .department(teacher.getDepartment().getId())
                .build();
    }
}
