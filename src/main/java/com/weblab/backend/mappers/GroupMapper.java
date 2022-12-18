package com.weblab.backend.mappers;

import com.weblab.backend.entities.Departments;
import com.weblab.backend.entities.Groups;
import com.weblab.backend.models.GroupModel;

public class GroupMapper {

    public static Groups toEntity(GroupModel groupModel) {
        return Groups.builder()
                .course(groupModel.getCourse())
                .name(groupModel.getName())
                .department(Departments.builder()
                        .id(groupModel.getDepartmentId())
                        .build())
                .build();
    }


    public static GroupModel toModel(Groups groups) {
        return GroupModel.builder()
                .id(groups.getId())
                .name(groups.getName())
                .course(groups.getCourse())
                .departmentId(groups.getDepartment().getId())
                .build();
    }


}
