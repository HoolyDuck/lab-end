package com.weblab.backend.controllers;

import com.weblab.backend.entities.Schedules;
import com.weblab.backend.models.ImprovedScheduleModel;
import com.weblab.backend.models.PageScheduleModel;
import com.weblab.backend.models.ScheduleModel;
import com.weblab.backend.services.ScheduleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class SchedulesController {
    private final ScheduleService scheduleService;

    @Autowired
    public SchedulesController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }
    @GetMapping("/all")
    public List<ScheduleModel> getAllSchedules(){
        return scheduleService.getAllSchedules();
    }
    @GetMapping("/all2")
    public List<ImprovedScheduleModel> getAllSchedules2(){
        return scheduleService.getAllSchedules2();
    }
    @GetMapping("/order_by_group/{id}")
    public List<PageScheduleModel> getSchedulesByGroup(@PathVariable Long id){
        return scheduleService.getSchedulesByGroup(id);
    }
    @GetMapping("/order_by_teacher/{id}")
    public List<PageScheduleModel> getSchedulesByTeacher(@PathVariable Long id){
        return scheduleService.getSchedulesByTeacher(id);
    }
    @PostMapping("/add")
    public void insert_schedule(@Valid @RequestBody ScheduleModel newSchedule){
        scheduleService.insert_schedule(newSchedule);
    }
    @PutMapping("/update/{id}")
    public void update_schedule(@Valid @RequestBody ScheduleModel newSchedule, @PathVariable Long id){
        scheduleService.update_schedule(newSchedule, id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete_schedule(@PathVariable Long id){
        scheduleService.delete_schedule(id);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<String> onMethodArgumentNotValidException(
            MethodArgumentNotValidException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
}
