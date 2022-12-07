package com.weblab.backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teachers")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "departmentid", referencedColumnName = "id")
    private Departments department;

    public Teachers() {

    }
}
