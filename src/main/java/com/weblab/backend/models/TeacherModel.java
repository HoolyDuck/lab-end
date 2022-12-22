package com.weblab.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TeacherModel {
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
    @JsonProperty("surname")
    @NotBlank
    private String surname;
    @JsonProperty("department_id")
    @NotNull
    @Positive
    private Long department;
}
