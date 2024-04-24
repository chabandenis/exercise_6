package ru.chaban.exercise_4.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
public class TppProductRegister {
    @Id
    @GeneratedValue
    Integer id;
    Integer productId;
    @ManyToOne

    TppRefProductRegisterType type;
    Integer account;
    String currencyCode;
    String state;
    String accountNumber;
}
