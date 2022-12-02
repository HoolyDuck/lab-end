package com.weblab.backend.controllers;

import com.weblab.backend.models.Schedules;
import com.weblab.backend.repositories.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
