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
public class TeacherSelectModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("label")
    private String nameSurname;


}
