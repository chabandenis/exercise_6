package ru.chaban.exercise_4.controller.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.chaban.exercise_4.request.CorporateSettlementAccountCreateRequestDto;
import ru.chaban.exercise_4.request.CorporateSettlementInstanceCreateRequestDto;
import ru.chaban.exercise_4.response.CorporateSettlementAccountCreateResponseDto;
import ru.chaban.exercise_4.response.CorporateSettlementInstanceCreateResponseDto;
import ru.chaban.exercise_4.service.RetailLoanChangeService;

/**
 * Контроллер для добавления/изменения актуальных параметров обслуживания экземпляра продукта.
 *
 * @author VSokolov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "corporate-settlement-account")
public class CorporateSettlementAccountController implements CorporateSettlementAccountApi {

    private final RetailLoanChangeService retailLoanChangeService;

    @Override
    public CorporateSettlementAccountCreateResponseDto create(CorporateSettlementAccountCreateRequestDto request) {
        return ResponseEntity.ok(retailLoanChangeService.create(request)).getBody();
    }
}
