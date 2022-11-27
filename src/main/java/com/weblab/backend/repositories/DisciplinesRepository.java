package com.weblab.backend.repositories;

import com.weblab.backend.models.Disciplines;
import org.springframework.data.repository.CrudRepository;

public interface DisciplinesRepository extends CrudRepository<Disciplines, Long> {
}
