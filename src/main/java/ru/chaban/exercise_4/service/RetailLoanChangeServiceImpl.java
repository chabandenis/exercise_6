package ru.chaban.exercise_4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chaban.exercise_4.request.RequestDto;
import ru.chaban.exercise_4.response.ResponseDto;

/**
 * Реализация для сохранения актуальных параметров по обслуживанию экземпляра продукта.
 *
 * @author VSokolov
 */
@Service
@RequiredArgsConstructor
public class RetailLoanChangeServiceImpl implements RetailLoanChangeService {

    @Override
    public ResponseDto changeArrangementPlanCondition(RequestDto request) {
        ResponseDto myResponseDto = new ResponseDto();
        myResponseDto.txt ="Привет мир";

        return myResponseDto;
    }
}
