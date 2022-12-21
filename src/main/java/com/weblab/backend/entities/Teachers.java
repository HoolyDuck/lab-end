package com.weblab.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "teachers")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;
    @Column(name = "surname", nullable = false)
    @NotBlank
    private String surname;
    @Column(name = "email", nullable = false)
    @NotBlank
    @Email
    private String email;
    @Column(name = "phone", nullable = false)
    @NotBlank
    private String phone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "departmentid", referencedColumnName = "id")
    @NotNull
    private Departments department;

    public Teachers() {

    }
}
