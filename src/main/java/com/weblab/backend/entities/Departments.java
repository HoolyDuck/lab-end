package com.weblab.backend.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "departments")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "short_name", nullable = false, unique = true)
    private String shortName;

    @ManyToOne()
    @JoinColumn(name = "faculty_id", referencedColumnName = "id")
    private Faculties faculty;

    public Departments() {

    }
}
