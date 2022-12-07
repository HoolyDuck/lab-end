package com.weblab.backend.repositories;

import com.weblab.backend.entities.Teachers;
import org.springframework.data.repository.CrudRepository;

public interface TeachersRepository extends CrudRepository<Teachers, Long> {
}