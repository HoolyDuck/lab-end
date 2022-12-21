package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class FacultyModel {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("short_name")
    @NotBlank
    private String shortName;
}
