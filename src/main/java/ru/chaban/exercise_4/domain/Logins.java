package ru.chaban.exercise_4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Data
public class Logins {
    @Id
    //@GeneratedValue
    private Integer id;

    private LocalDate access_date;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users userId;

    private String application;
}
