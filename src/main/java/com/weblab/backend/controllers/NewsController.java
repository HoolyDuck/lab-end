package com.weblab.backend.controllers;

import com.weblab.backend.models.News;
import com.weblab.backend.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
@RequestMapping("/api/news")
public class NewsController {
    private final NewsRepository newsRepository;

    @Autowired
    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping("/all")
    public Iterable<News> getAllNews(){
        return newsRepository.findAll();
    }

}
