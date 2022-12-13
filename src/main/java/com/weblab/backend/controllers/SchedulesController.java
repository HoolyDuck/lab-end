package com.weblab.backend.controllers;

import com.weblab.backend.entities.Schedules;
import com.weblab.backend.repositories.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedules")
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
                    schedule.setTime(newSchedule.getTime());
                    schedule.setGroupId(newSchedule.getGroupId());
                    schedule.setDisciplineId(newSchedule.getDisciplineId());
                    schedule.setTeacherId(newSchedule.getTeacherId());
                    schedule.setName(newSchedule.getName());
                    schedule.setClassroom(newSchedule.getClassroom());
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
