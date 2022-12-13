package com.weblab.backend.entities;

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
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "date", nullable = false)
    private Date date;

    public News() {

    }
}
