package com.weblab.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Table(name="students")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;
    @Column(name = "email", nullable = false)
    @NotBlank
    @Email
    private String email;
    @Column(name = "phone", nullable = false)
    @NotBlank
    @Pattern(regexp = "^[0-1][0-9]:[0-5][0-9]|[1-2][0-3]:[0-5][0-9]$")
    private String phone;
    @ManyToOne(optional = false)
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Groups group;
    public Students() {

    }
}
