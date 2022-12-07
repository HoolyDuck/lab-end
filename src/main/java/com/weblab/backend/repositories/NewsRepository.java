package com.weblab.backend.repositories;

import com.weblab.backend.entities.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}