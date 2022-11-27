package com.weblab.backend.repositories;

import com.weblab.backend.models.Departments;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsRepository extends CrudRepository<Departments, Long> {
}