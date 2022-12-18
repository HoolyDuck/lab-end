package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.weblab.backend.entities.Teachers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ImprovedScheduleModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("classroom")
    private String classroom;
    @JsonProperty("name")
    private String name;
    @JsonProperty("time")
    private String time;
    @JsonProperty("discipline_id")
    private String disciplineId;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("teacher_id")
    private Teachers teacherId;
}
