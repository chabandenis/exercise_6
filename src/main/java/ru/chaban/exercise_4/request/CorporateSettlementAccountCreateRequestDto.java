package ru.chaban.exercise_4.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateSettlementAccountCreateRequestDto {
    String instanceId;
    String registryTypeCode;
    String accountType;
    String currencyCode;
    String branchCode;
    String priorityCode;
    String mdmCode;
    String clientCode;
    String trainRegion;
    String counter;
    String salesCode;
}
