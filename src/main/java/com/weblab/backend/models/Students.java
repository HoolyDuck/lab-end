package com.weblab.backend.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name="students")
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Column(name = "fullname", nullable = false)
    private String fullname;
    @ManyToOne(optional = false)
    private Groups groupid;
    //Далі придумаємо
}
