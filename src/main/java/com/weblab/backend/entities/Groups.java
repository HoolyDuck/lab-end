package com.weblab.backend.entities;

import jakarta.persistence.*;
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
    private String name;
    @Column(name = "course", nullable = false)
    private Long course;

    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    private Departments department;

    @OneToMany(mappedBy = "group", orphanRemoval = true)
    Set<Students> students;

    public Groups() {

    }
}
