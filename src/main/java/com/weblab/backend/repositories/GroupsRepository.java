package com.weblab.backend.repositories;

import com.weblab.backend.models.Groups;
import org.springframework.data.repository.CrudRepository;

public interface GroupsRepository extends CrudRepository<Groups, Long> {
}