package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="students")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @ManyToOne(optional = false)
    @JoinColumn(name = "groupid", referencedColumnName = "id", nullable = false)
    private Groups group;
    public Students() {

    }
}
