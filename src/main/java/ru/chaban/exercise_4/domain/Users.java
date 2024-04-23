package ru.chaban.exercise_4.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
public class Users {
    @Id
    //@GeneratedValue
    private Integer id;

    private String fio;

    private String username;
}
