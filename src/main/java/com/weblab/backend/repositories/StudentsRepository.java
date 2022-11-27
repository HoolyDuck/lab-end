package com.weblab.backend.repositories;

import com.weblab.backend.models.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Students, Long> {
}