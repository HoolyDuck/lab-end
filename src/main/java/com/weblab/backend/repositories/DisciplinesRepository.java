package com.weblab.backend.repositories;

import com.weblab.backend.entities.Disciplines;
import org.springframework.data.repository.CrudRepository;

public interface DisciplinesRepository extends CrudRepository<Disciplines, Long> {
}
