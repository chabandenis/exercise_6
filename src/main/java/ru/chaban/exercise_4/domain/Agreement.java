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
public class Agreement {
    @Id
    @GeneratedValue
    Integer id;
    @ManyToOne
    TppProduct product ;
    String generalAgreementId;
    String supplementaryAgreementId;
    String arrangementType;
    Integer shedulerJobId;
    String number;
    LocalDate openingDate;
    LocalDate closingDate;
    LocalDate cancelDdate;
    Integer validityDuration;
    String cancellationReason;
    String status;
    LocalDate interestCalculationDate;
    Integer interestRate;
    Integer coefficient;
    String coefficientAction;
    Integer minimumInterestRate;
    Integer minimumInterestRateCoefficient;
    Integer minimumInterestRateCoefficientAction;
    Integer maximalInterestRate;
    Integer maximalInterestRateCoefficient;
    String maximalInterestRateCoefficientAction;
}
