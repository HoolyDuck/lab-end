package com.weblab.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "groups")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;
    @Column(name = "course", nullable = false)
    @NotBlank
    @Min(1)
    @Max(5)
    private Long course;

    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Departments department;

    @OneToMany(mappedBy = "group", orphanRemoval = true)
    Set<Students> students;

    public Groups() {

    }
}
