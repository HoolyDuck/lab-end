package com.weblab.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "disciplines")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Disciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "disciplineId", cascade = CascadeType.REMOVE, orphanRemoval = true)
    Set<Schedules> schedules;

    public Disciplines() {

    }
}
