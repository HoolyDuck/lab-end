package com.weblab.backend.controllers;

import com.weblab.backend.models.GroupModel;
import com.weblab.backend.services.GroupService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupsController {


    private final GroupService groupService;

    @Autowired
    public GroupsController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("")
    public List<GroupModel> getAllGroups() {
        return groupService.getAll();
    }

    @PostMapping("")
    public void addGroup(@Valid @RequestBody GroupModel newGroup) {
        groupService.add(newGroup);
    }

    @PutMapping("{id}")
    public void updateGroup(@Valid @RequestBody GroupModel newGroup, @PathVariable Long id) {
        groupService.update(newGroup, id);
    }

    @DeleteMapping("{id}")
    public void deleteGroup(@PathVariable Long id) {
        groupService.deleteById(id);
    }
}