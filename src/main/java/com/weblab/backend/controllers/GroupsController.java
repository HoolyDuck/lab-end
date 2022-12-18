package com.weblab.backend.controllers;

import com.weblab.backend.entities.Groups;
import com.weblab.backend.repositories.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups")
public class GroupsController {
    private final GroupsRepository groupsRepository;

    @Autowired
    public GroupsController(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }

    @GetMapping("")
    public Iterable<Groups> getAllGroups(){
        return groupsRepository.findAll();
    }


    @PostMapping("")
    public Groups addGroup(@RequestBody Groups newGroup){
        return groupsRepository.save(newGroup);
    }

    @PutMapping("{id}")
    public Groups updateGroup(@RequestBody Groups newGroup, @PathVariable Long id){
        return groupsRepository.findById(id).
                map(group -> {
                    group.setName(newGroup.getName());
                    group.setDepartment(newGroup.getDepartment());
                    group.setCourse(newGroup.getCourse());
                    return groupsRepository.save(group);
                })
                .orElseGet(() ->{
                    newGroup.setId(id);
                    return groupsRepository.save(newGroup);
                });
    }
    @DeleteMapping("{id}")
    public void deleteGroup(@PathVariable Long id){
        groupsRepository.deleteById(id);
    }
}