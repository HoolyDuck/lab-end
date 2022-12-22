package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
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
    @NotNull
    private Long course;

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("department_id")
    @NotNull
    @Positive
    private Long departmentId;

}
