package com.weblab.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

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

    public Disciplines() {

    }
}
