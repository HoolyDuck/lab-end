package com.weblab.backend.mappers;

import com.weblab.backend.entities.Groups;
import com.weblab.backend.entities.Students;
import com.weblab.backend.models.StudentModel;

public class StudentMapper {

    public static Students toEntity(StudentModel studentModel) {
        return Students.builder()
                .name(studentModel.getName())
                .email(studentModel.getEmail())
                .phone(studentModel.getPhone())
                .group(Groups.builder()
                        .id(studentModel.getGroupId())
                        .build())
                .build();
    }

    public static StudentModel toModel(Students students) {
        return StudentModel.builder()
                .id(students.getId())
                .name(students.getName())
                .email(students.getEmail())
                .phone(students.getPhone())
                .groupId(students.getGroup().getId())
                .build();
    }



}
