package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "schedules")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToMany
    @JoinColumn(name = "tesachersid", referencedColumnName = "id", nullable = false)
    private Set<Teachers> teachers;
    @ManyToMany
    @JoinColumn(name = "groupsid", referencedColumnName = "id", nullable = false)
    private Set<Groups> groups;
    @ManyToMany
    @JoinColumn(name = "disciplinesid", referencedColumnName = "id", nullable = false)
    private Set<Disciplines> disciplines;
    @Column(name = "date", nullable = false)
    private Date date;

    public Schedules() {

    }
}
