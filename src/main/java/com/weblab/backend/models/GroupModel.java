package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class GroupModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("course")
    @Min(1)
    @Max(5)
    @NotBlank
    private Long course;

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("department_id")
    @NotNull
    private Long departmentId;

}
