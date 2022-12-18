package com.weblab.backend.controllers;

import com.weblab.backend.models.DisciplineModel;
import com.weblab.backend.services.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disciplines")
public class DisciplinesController {
    private final DisciplineService disciplineService;

    @Autowired
    public DisciplinesController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @GetMapping("/all")
    public List<DisciplineModel> getAllDisciplines(){
        return disciplineService.getAllDisciplines();
    }
    @PostMapping ("/add")
    public void insert_discipline(@RequestBody DisciplineModel newDiscipline){
        disciplineService.insert_discipline(newDiscipline);
    }
    @PutMapping("/update/{id}")
    public void update_discipline(@RequestBody DisciplineModel newDiscipline, @PathVariable Long id){
        disciplineService.update_discipline(newDiscipline, id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete_discipline(@PathVariable Long id){
        disciplineService.delete_discipline(id);
    }
}
