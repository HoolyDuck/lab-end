package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @NotBlank
    private String email;

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("phone")
    @NotBlank
    @Pattern(regexp = "^[0-1][0-9]:[0-5][0-9]|[1-2][0-3]:[0-5][0-9]$")
    private String phone;

    @JsonProperty("group_id")
    @NotNull
    private Long groupId;

}
