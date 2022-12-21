package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private String classroom;
    @JsonProperty("name")
    @NotBlank
    private String name;
    @JsonProperty("time")
    private String time;
    @JsonProperty("discipline_id")
    @NotNull
    private Long disciplineId;
    @JsonProperty("group_id")
    @NotNull
    private Long groupId;
    @JsonProperty("teacher_id")
    @NotNull
    private Long teacherId;

}
