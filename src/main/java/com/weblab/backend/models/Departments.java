package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Optional;

@Entity
@Table(name="departments")
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
    @ManyToOne (optional = false)
    @JoinColumn(name = "facultyid", referencedColumnName = "id")
    private Faculties faculty;

    public Departments() {

    }
}
