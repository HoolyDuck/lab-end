package com.weblab.backend.controllers;

import com.weblab.backend.models.DisciplineModel;
import com.weblab.backend.services.DisciplineService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.resource.HttpResource;

import javax.net.ssl.SSLSession;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disciplines")
public class DisciplinesController {
    private final DisciplineService disciplineService;

    @Autowired
    public DisciplinesController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @GetMapping("/all")
    public List<DisciplineModel> getAllDisciplines() {
        return disciplineService.getAllDisciplines();
    }

    @PostMapping("/add")
    public void insert_discipline(@Valid @RequestBody DisciplineModel newDiscipline) {
        disciplineService.insert_discipline(newDiscipline);
    }

    @PutMapping("/update/{id}")
    public void update_discipline(@Valid @RequestBody DisciplineModel newDiscipline, @PathVariable Long id) {
        disciplineService.update_discipline(newDiscipline, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete_discipline(@PathVariable Long id) {
        disciplineService.delete_discipline(id);
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
