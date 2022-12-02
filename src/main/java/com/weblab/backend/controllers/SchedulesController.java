package com.weblab.backend.controllers;

import com.weblab.backend.models.Schedules;
import com.weblab.backend.repositories.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("api/shedules")
public class SchedulesController {
    private final SchedulesRepository schedulesRepository;

    @Autowired
    public SchedulesController(SchedulesRepository schedulesRepository) {
        this.schedulesRepository = schedulesRepository;
    }
    @GetMapping("/all")
    public Iterable<Schedules> getAllSchedules(){
        return schedulesRepository.findAll();
    }
    @PostMapping("/add")
    public Schedules insert_schedule(@RequestBody Schedules newSchedule){
        return schedulesRepository.save(newSchedule);
    }
    @PutMapping("/update/{id}")
    public Schedules update_schedule(@RequestBody Schedules newSchedule, @PathVariable Long id){
        return schedulesRepository.findById(id)
                .map(schedule -> {
                    schedule.setDate(newSchedule.getDate());
                    schedule.setGroups(newSchedule.getGroups());
                    schedule.setDisciplines(newSchedule.getDisciplines());
                    schedule.setTeachersid(newSchedule.getTeachersid());
                    return schedulesRepository.save(schedule);
                }).orElseGet(() ->{
                    newSchedule.setId(id);
                    return schedulesRepository.save(newSchedule);
                });
    }
    @DeleteMapping("/delete/{id}")
    public void delete_schedule(@PathVariable Long id){
        schedulesRepository.deleteById(id);
    }
}