package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class GroupModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("course")
    private Long course;

    @JsonProperty("name")
    private String name;

    @JsonProperty("department_id")
    private Long departmentId;

}
