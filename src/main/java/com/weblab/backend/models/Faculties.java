package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="faculties")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Faculties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "university")
    private String university;
    public Faculties() {

    }
}
