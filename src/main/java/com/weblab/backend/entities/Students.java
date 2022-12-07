package com.weblab.backend.entities;

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
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;
    @ManyToOne(optional = false)
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private Groups group;
    public Students() {

    }
}
