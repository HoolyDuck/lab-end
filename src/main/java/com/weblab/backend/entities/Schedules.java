package com.weblab.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Teachers teacherId;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Groups groupId;
    @ManyToOne
    @JoinColumn(name = "discipline_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Disciplines disciplineId;
    @Column(name = "time", nullable = false)
    @NotBlank
    private String time;

    @Column(name = "classroom", nullable = false)
    @NotBlank
    private String classroom;


    public Schedules() {

    }
}
