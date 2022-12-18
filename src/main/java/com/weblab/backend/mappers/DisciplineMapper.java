package com.weblab.backend.mappers;

import com.weblab.backend.entities.Disciplines;
import com.weblab.backend.models.DisciplineModel;

public class DisciplineMapper {
    public static Disciplines toEntity(DisciplineModel disciplineModel){
        return Disciplines.builder()
                .name(disciplineModel.getName())
                .build();
    }
    public static DisciplineModel toModel(Disciplines discipline){
        return DisciplineModel.builder()
                .id(discipline.getId())
                .name(discipline.getName())
                .build();
    }
}
