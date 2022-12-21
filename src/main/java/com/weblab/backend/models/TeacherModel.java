package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TeacherModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("email")
    @NotBlank
    @Email
    private String email;
    @JsonProperty("name")
    @NotBlank
    private String name;
    @JsonProperty("phone")
    @NotBlank
    private String phone;
    @JsonProperty("surname")
    @NotBlank
    private String surname;
    @JsonProperty("department_id")
    @NotBlank
    private Long department;
}
