package ru.chaban.exercise_4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Data
public class TppProduct {
    @Id
    @GeneratedValue
    Integer id;
	Integer agreementId;
    Integer productCodeId;
    Integer clientId;
    String type;
    String number;
    Integer priority;
    LocalDate dateOfConclusion;
    LocalDate startDateTime;
    LocalDate endDateTime;
    Integer days;
    Integer penaltyRate;
    Integer nso;
    Integer thresholdAmount;
    String requisiteType;
    String interestRateType;
    //String taxRate;
    String  reasoneClose;
    String state;
}
