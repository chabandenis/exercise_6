package ru.chaban.exercise_4.service;

import ru.chaban.exercise_4.request.CorporateSettlementAccountCreateRequestDto;
import ru.chaban.exercise_4.request.CorporateSettlementInstanceCreateRequestDto;
import ru.chaban.exercise_4.response.CorporateSettlementAccountCreateResponseDto;
import ru.chaban.exercise_4.response.CorporateSettlementInstanceCreateResponseDto;

/**
 * Интерфейс для сохранения актуальных параметров по обслуживанию экземпляра продукта.
 *
 * @author VSokolov
 */
public interface RetailLoanChangeService {


    CorporateSettlementInstanceCreateResponseDto create(CorporateSettlementInstanceCreateRequestDto request);

    CorporateSettlementAccountCreateResponseDto create(CorporateSettlementAccountCreateRequestDto request);

}
