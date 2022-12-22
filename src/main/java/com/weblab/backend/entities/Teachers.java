package com.weblab.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Set;

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
    @Email
    private String email;
    @Column(name = "phone", nullable = false)
    @Pattern(regexp = "(\\+\\d{3}\\d{9})" +
            "|(\\+\\d{2}\\(\\d{3}\\)\\d{7})|" +
            "(\\(\\d{3}\\)\\d{7})|" +
            "(0\\(\\d{3}\\)\\d{6})")
    private String phone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "departmentid", referencedColumnName = "id")
    @NotNull
    private Departments department;
    @JsonIgnore
    @OneToMany(mappedBy = "teacherId", cascade = CascadeType.REMOVE, orphanRemoval = true)
    Set<Schedules> schedules;

    public Teachers() {

    }
}
