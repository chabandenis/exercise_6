package ru.chaban.exercise_4.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateSettlementAccountCreateResponseDto {
    public DataCreateAccount data;
}
