package ru.chaban.exercise_4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.chaban.exercise_4.controller.api.ChangeRetailLoanApi;
import ru.chaban.exercise_4.request.RequestDto;
import ru.chaban.exercise_4.response.ResponseDto;
import ru.chaban.exercise_4.service.RetailLoanChangeService;

/**
 * Контроллер для добавления/изменения актуальных параметров обслуживания экземпляра продукта.
 *
 * @author VSokolov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1")
public class ChangeRetailLoanController implements ChangeRetailLoanApi {

    private final RetailLoanChangeService retailLoanChangeService;

    @Override
    public ResponseDto changeArrangementPlanCondition(RequestDto request) {
        return ResponseEntity.ok(retailLoanChangeService.changeArrangementPlanCondition(request)).getBody();
    }
}