package com.weblab.backend.repositories;

import com.weblab.backend.models.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}