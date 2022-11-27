package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.*;

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
    @ManyToOne(optional = false)
    @JoinColumn(name = "departmentid", referencedColumnName = "id", nullable = false)
    private Departments department;
    @Column(name = "speciality", nullable = false)
    private String speciality;
    @Column(name = "number", nullable = false)
    private int number;

    public Groups() {

    }
}
