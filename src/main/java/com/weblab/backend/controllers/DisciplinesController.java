package com.weblab.backend.controllers;

import com.weblab.backend.entities.Disciplines;
import com.weblab.backend.repositories.DisciplinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/disciplines")
public class DisciplinesController {
    private final DisciplinesRepository disciplinesRepository;

    @Autowired
    public DisciplinesController(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

    @GetMapping("/all")
    public Iterable<Disciplines> getAllDisciplines(){
        return disciplinesRepository.findAll();
    }
    @PostMapping ("/add")
    public Disciplines insert_discipline(@RequestBody Disciplines newDiscipline){
        return disciplinesRepository.save(newDiscipline);
    }
    @PutMapping("/update/{id}")
    public Disciplines update_discipline(@RequestBody Disciplines newDiscipline, @PathVariable Long id){
        return disciplinesRepository.findById(id).
                map(discipline -> {
                    discipline.setName(newDiscipline.getName());
                    return disciplinesRepository.save(discipline);
                })
                .orElseGet(() ->{
                    newDiscipline.setId(id);
                    return disciplinesRepository.save(newDiscipline);
                });
    }
    @DeleteMapping("/delete/{id}")
    public void delete_discipline(@PathVariable Long id){
        disciplinesRepository.deleteById(id);
    }
}
