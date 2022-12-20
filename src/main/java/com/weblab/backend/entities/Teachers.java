package com.weblab.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

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
    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;
    @NotBlank
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "email", nullable = false)
    @Email
    private String email;
    @Column(name = "phone", nullable = false)
    @Pattern(regexp = "(\\+\\d{3}\\d{9})" +
            "|(\\+\\d{2}\\(\\d{3}\\)\\d{7})|" +
            "(\\(\\d{3}\\)\\d{7})|" +
            "(0\\(\\d{3}\\)\\d{6})")
    private String phone;
    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "departmentid", referencedColumnName = "id")
    private Departments department;
    @JsonIgnore
    @OneToMany(mappedBy = "teacherId", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<Schedules> schedules;
    public Teachers() {

    }
}
