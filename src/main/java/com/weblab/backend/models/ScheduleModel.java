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
public class ScheduleModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("classroom")
    private String classroom;
    @JsonProperty("name")
    private String name;
    @JsonProperty("time")
    private String time;
    @JsonProperty("discipline_id")
    private Long disciplineId;
    @JsonProperty("group_id")
    private Long groupId;
    @JsonProperty("teacher_id")
    private Long teacherId;

}
