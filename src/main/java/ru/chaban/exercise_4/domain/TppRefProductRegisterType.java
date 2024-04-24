package ru.chaban.exercise_4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Data
public class TppRefProductRegisterType {
    @Id
    @GeneratedValue
    Integer internalId;
    String value;
    String registerTypeName;
    @ManyToOne
    TppRefProductClass productClassCode;
    LocalDate registerTypeStartDate;
    LocalDate registerTypeEndDate;
    @ManyToOne
    TppRefAccountType accountType;
}
