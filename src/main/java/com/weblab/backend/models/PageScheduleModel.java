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
public class PageScheduleModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("classroom")
    private String classroom;
    @JsonProperty("name")
    private String name;
    @JsonProperty("time")
    private String time;
    @JsonProperty("discipline_name")
    private String disciplineName;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("teacher_name")
    private String teacherName;
    @JsonProperty("teacher_surname")
    private String teacherSurname;
}
