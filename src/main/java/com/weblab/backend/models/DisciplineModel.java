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
public class DisciplineModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
}
