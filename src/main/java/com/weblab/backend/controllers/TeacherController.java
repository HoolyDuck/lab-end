package com.weblab.backend.controllers;

import com.weblab.backend.models.TeacherModel;
import com.weblab.backend.models.TeacherSelectModel;
import com.weblab.backend.services.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("/all")
    public List<TeacherModel> select_teachers() {
        return teacherService.select_teachers();
    }

    @PostMapping("/add")
    public void insert_teacher(@Valid @RequestBody TeacherModel newTeacher) {
         teacherService.insert_teacher(newTeacher);
    }

    @PutMapping("/update/{id}")
    public void update_teacher(@Valid @RequestBody TeacherModel newTeacher, @PathVariable Long id) {
        teacherService.update_teacher(newTeacher, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete_teacher(@PathVariable Long id) {
        teacherService.delete_teacher(id);
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


    @GetMapping("select")
    public List<TeacherSelectModel> getTeacherSelectModels() {
        return teacherService.getAllTeacherNames();
    }

}
