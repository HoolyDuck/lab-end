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
public class StudentModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("email")
    @Email
    private String email;

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("phone")
    @Pattern(regexp = "(\\+\\d{3}\\d{9})" +
            "|(\\+\\d{2}\\(\\d{3}\\)\\d{7})|" +
            "(\\(\\d{3}\\)\\d{7})|" +
            "(0\\(\\d{3}\\)\\d{6})")
    private String phone;

    @JsonProperty("group_id")
    @NotNull
    @Positive
    private Long groupId;

}
