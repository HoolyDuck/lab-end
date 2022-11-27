package com.weblab.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name="schedules")
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Далі придумаємо
}
