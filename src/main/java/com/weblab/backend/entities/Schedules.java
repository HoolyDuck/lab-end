package com.weblab.backend.entities;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", nullable = false)
    private Teachers teacherId;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private Groups groupId;
    @ManyToOne
    @JoinColumn(name = "discipline_id", referencedColumnName = "id", nullable = false)
    private Disciplines disciplineId;
    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "classroom", nullable = false)
    private String classroom;


    public Schedules() {

    }
}
