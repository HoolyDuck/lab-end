package com.weblab.backend.mappers;

import com.weblab.backend.entities.Departments;
import com.weblab.backend.entities.Faculties;
import com.weblab.backend.models.DepartmentModel;

public class DepartmentMapper {

    public static Departments toEntity(DepartmentModel departmentModel) {
        return Departments.builder()
                .name(departmentModel.getName())
                .shortName(departmentModel.getShortName())
                .faculty(
                        Faculties.builder()
                        .id(departmentModel.getFacultyId()).build())
                .build();
    }


    public static DepartmentModel toModel(Departments departments) {
        return DepartmentModel.builder()
                .id(departments.getId())
                .name(departments.getName())
                .shortName(departments.getShortName())
                .facultyId(departments.getFaculty().getId())
                .build();
    }


}
