package com.weblab.backend.services;

import com.weblab.backend.entities.Disciplines;
import com.weblab.backend.mappers.DisciplineMapper;
import com.weblab.backend.models.DisciplineModel;
import com.weblab.backend.repositories.DisciplinesRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DisciplineService {
    private final DisciplinesRepository disciplinesRepository;

    public DisciplineService(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

    public List<DisciplineModel> getAllDisciplines() {
        List<DisciplineModel> disciplineModels = new ArrayList<>();
        disciplinesRepository.findAll().forEach(disciplines ->
            disciplineModels.add(DisciplineMapper.toModel(disciplines))
        );
        return disciplineModels;
    }

    public void insert_discipline(DisciplineModel newDiscipline){
        disciplinesRepository.save(DisciplineMapper.toEntity(newDiscipline));
    }

    public void update_discipline(DisciplineModel insertDiscipline, Long id){
        Disciplines newDiscipline = DisciplineMapper.toEntity(insertDiscipline);
        disciplinesRepository.findById(id).
                map(discipline -> {
                    discipline.setName(newDiscipline.getName());
                    return disciplinesRepository.save(discipline);
                })
                .orElseGet(() ->{
                    newDiscipline.setId(id);
                    return disciplinesRepository.save(newDiscipline);
                });
    }

    public void delete_discipline(Long id) {
        disciplinesRepository.deleteById(id);
    }
}
