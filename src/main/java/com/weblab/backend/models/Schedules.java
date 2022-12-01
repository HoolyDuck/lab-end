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
    @ManyToOne
    @JoinColumn(name = "teachersid", referencedColumnName = "id", nullable = false)
    private Teachers teachersid;
    @ManyToOne
    @JoinColumn(name = "groupsid", referencedColumnName = "id", nullable = false)
    private Groups groups;
    @ManyToOne
    @JoinColumn(name = "disciplinesid", referencedColumnName = "id", nullable = false)
    private Disciplines disciplines;
    @Column(name = "date", nullable = false)
    private Date date;

    public Schedules() {

    }
}
