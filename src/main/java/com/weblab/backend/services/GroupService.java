package com.weblab.backend.services;


import com.weblab.backend.entities.Departments;
import com.weblab.backend.mappers.GroupMapper;
import com.weblab.backend.models.GroupModel;
import com.weblab.backend.repositories.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {

    private final GroupsRepository groupsRepository;

    @Autowired
    public GroupService(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }


    public List<GroupModel> getAll() {
        List<GroupModel> groupModels = new ArrayList<>();
        groupsRepository.findAll().forEach(groups ->
                groupModels.add(GroupMapper.toModel(groups)));
        return groupModels;
    }

    public void add(GroupModel newGroup) {
        groupsRepository.save(GroupMapper.toEntity(newGroup));
    }

    public void update(GroupModel newGroup, Long id) {
        groupsRepository.findById(id).
                map(group -> {
                    group.setName(newGroup.getName());
                    group.setDepartment(Departments.builder()
                            .id(newGroup.getDepartmentId())
                            .build());
                    group.setCourse(newGroup.getCourse());
                    return groupsRepository.save(group);
                })
                .orElseGet(() -> {
                    newGroup.setId(id);
                    return groupsRepository.save(GroupMapper.toEntity(newGroup));
                });
    }


    public void deleteById(Long id) {
        groupsRepository.deleteById(id);
    }


}
