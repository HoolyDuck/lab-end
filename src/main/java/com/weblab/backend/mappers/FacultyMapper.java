package com.weblab.backend.mappers;

import com.weblab.backend.entities.Faculties;
import com.weblab.backend.models.FacultyModel;

public class FacultyMapper {

    public static Faculties toEntity(FacultyModel facultyModel) {
        return Faculties.builder()
                .name(facultyModel.getName())
                .shortName(facultyModel.getShortName())
                .build();
    }

    public static FacultyModel toModel(Faculties faculties) {
        return FacultyModel.builder()
                .id(faculties.getId())
                .shortName(faculties.getShortName())
                .name(faculties.getName())
                .build();
    }
}
