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
public class DepartmentModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("short_name")
    @NotBlank
    private String shortName;

    @JsonProperty("faculty_id")
    @NotNull
    private Long facultyId;
}
