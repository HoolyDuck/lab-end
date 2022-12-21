package com.weblab.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "faculties")
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
    @Column(name = "short_name")
    private String shortName;

    @JsonIgnore
    @OneToMany(mappedBy = "faculty", cascade = CascadeType.REMOVE, orphanRemoval = true)
    Set<Departments> departments;

    public Faculties() {

    }
}
