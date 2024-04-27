package ru.chaban.exercise_4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chaban.exercise_4.request.CorporateSettlementInstanceCreateRequestDto;
import ru.chaban.exercise_4.response.CorporateSettlementInstanceCreateResponseDto;

/**
 * Реализация для сохранения актуальных параметров по обслуживанию экземпляра продукта.
 *
 * @author VSokolov
 */
@Service
@RequiredArgsConstructor
public class RetailLoanChangeServiceImpl implements RetailLoanChangeService {

    @Override
    public CorporateSettlementInstanceCreateResponseDto changeArrangementPlanCondition(CorporateSettlementInstanceCreateRequestDto request) {
        CorporateSettlementInstanceCreateResponseDto myCorporateSettlementInstanceCreateResponseDto = new CorporateSettlementInstanceCreateResponseDto();
        myCorporateSettlementInstanceCreateResponseDto.txt ="Привет мир";

        return myCorporateSettlementInstanceCreateResponseDto;
    }
}
