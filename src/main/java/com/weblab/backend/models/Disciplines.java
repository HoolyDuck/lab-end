package com.weblab.backend.models;

import jakarta.persistence.*;
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
    private String name;

    @ManyToOne
    @JoinColumn(name = "tesacherid", referencedColumnName = "id", nullable = false)
    private Teachers teacher;

    public Disciplines() {

    }
}
