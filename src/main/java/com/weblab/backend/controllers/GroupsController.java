package com.weblab.backend.controllers;

import com.weblab.backend.entities.Groups;
import com.weblab.backend.repositories.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/groups")
public class GroupsController {
    private final GroupsRepository groupsRepository;

    @Autowired
    public GroupsController(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }

    @GetMapping("/all")
    public Iterable<Groups> getAllGroups(){
        return groupsRepository.findAll();
    }
}
