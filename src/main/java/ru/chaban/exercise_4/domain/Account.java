package ru.chaban.exercise_4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
public class Account {
    @Id
    @GeneratedValue
    Integer id;
    @ManyToOne
    AccountPool accountPool;
    String accountNumber;
    Boolean bussy;
}
