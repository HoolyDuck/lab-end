package com.weblab.backend.repositories;

import com.weblab.backend.entities.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Students, Long> {
}