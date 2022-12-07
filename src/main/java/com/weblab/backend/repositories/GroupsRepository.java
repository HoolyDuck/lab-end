package com.weblab.backend.repositories;

import com.weblab.backend.entities.Groups;
import org.springframework.data.repository.CrudRepository;

public interface GroupsRepository extends CrudRepository<Groups, Long> {
}