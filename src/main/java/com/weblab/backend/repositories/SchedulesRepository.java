package com.weblab.backend.repositories;

import com.weblab.backend.entities.Schedules;
import org.springframework.data.repository.CrudRepository;

public interface SchedulesRepository extends CrudRepository<Schedules, Long> {
}