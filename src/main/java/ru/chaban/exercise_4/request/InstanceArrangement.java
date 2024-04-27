package ru.chaban.exercise_4.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstanceArrangement {
    String GeneralAgreementId;

    String SupplementaryAgreementId;

    String arrangementType;

    String shedulerJobId;

    String number;

    String openingDate;

    String closingDate;

    String cancelDate;

    String validityDuration;

    String cancellationReason;

    String tatus;

    String interestCalculationDate;

    String interestRate;

    String coefficient;

    String coefficientAction;

    String minimumInterestRate;

    String minimumInterestRateCoefficient;

    String minimumInterestRateCoefficientAction;

    String maximalnterestRate;

    String maximalnterestRateCoefficient;

    String maximalnterestRateCoefficientAction;

}
