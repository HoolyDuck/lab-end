package com.weblab.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
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
    @NotBlank
    private String title;
    @Column(name = "text")
    @NotBlank
    private String text;
    @Column(name = "date", nullable = false)
    @NotBlank
    @Past
    private Date date;
    @Column(name = "img")
    @NotBlank
    private String img;

    public News() {

    }
}
