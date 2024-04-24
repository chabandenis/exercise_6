package ru.chaban.exercise_4.service;

import ru.chaban.exercise_4.request.RequestDto;
import ru.chaban.exercise_4.response.ResponseDto;

/**
 * Интерфейс для сохранения актуальных параметров по обслуживанию экземпляра продукта.
 *
 * @author VSokolov
 */
public interface RetailLoanChangeService {

    /**
     * Сохранение актуальных условий планирования для графика платежей экземпляра продукта.
     *
     * @param request входные параметры
     * @return ответ
     */
    ResponseDto changeArrangementPlanCondition(RequestDto request);

}
