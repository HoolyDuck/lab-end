package com.weblab.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @Min(1)
    @Max(5)
    private Long course;
    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Departments department;
    @OneToMany(mappedBy = "group", orphanRemoval = true)
    Set<Students> students;
    @JsonIgnore
    @OneToMany(mappedBy = "groupId", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<Schedules> schedules;
    public Groups() {

    }
}
