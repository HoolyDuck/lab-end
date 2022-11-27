package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "news")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "subject", referencedColumnName = "id", nullable = false)
    private Departments department;
    @Column(name = "text")
    private String text;
    @Column(name = "date", nullable = false)
    private Date date;

    public News() {

    }
}
