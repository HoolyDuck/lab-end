package com.weblab.backend.controllers;

import com.weblab.backend.entities.News;
import com.weblab.backend.repositories.NewsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
public class NewsController {
    private final NewsRepository newsRepository;

    @Autowired
    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping("/all")
    public Iterable<News> getAllNews() {
        return newsRepository.findAll();
    }

    @PostMapping("/add")
    public News insert_new(@Valid @RequestBody News newNew) {
        return newsRepository.save(newNew);
    }

    @PutMapping("/update/{id}")
    public News update_new(@Valid @RequestBody News newNew, @PathVariable Long id) {
        return newsRepository.findById(id)
                .map(New -> {
                    New.setDate(newNew.getDate());
                    New.setText(newNew.getText());
                    New.setTitle(newNew.getTitle());
                    return newsRepository.save(New);
                })
                .orElseGet(() -> {
                    newNew.setId(id);
                    return newsRepository.save(newNew);
                });
    }
    @DeleteMapping("/delete/{id}")
    public void delete_new(@PathVariable Long id){
        newsRepository.deleteById(id);
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
