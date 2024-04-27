package ru.chaban.exercise_4.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chaban.exercise_4.request.CorporateSettlementAccountCreateRequestDto;
import ru.chaban.exercise_4.request.CorporateSettlementInstanceCreateRequestDto;
import ru.chaban.exercise_4.response.CorporateSettlementAccountCreateResponseDto;
import ru.chaban.exercise_4.response.CorporateSettlementInstanceCreateResponseDto;
import ru.chaban.exercise_4.response.DataCreate;
import ru.chaban.exercise_4.response.DataCreateAccount;

/**
 * Реализация для сохранения актуальных параметров по обслуживанию экземпляра продукта.
 *
 * @author VSokolov
 */
@Data
@Service
@RequiredArgsConstructor
public class RetailLoanChangeServiceImpl implements RetailLoanChangeService {

    @Override
    public CorporateSettlementInstanceCreateResponseDto create(CorporateSettlementInstanceCreateRequestDto request) {
        CorporateSettlementInstanceCreateResponseDto responseDto = new CorporateSettlementInstanceCreateResponseDto();
        DataCreate dat = new DataCreate();
        dat.setInstanceId("swef w we");
        dat.setRegisterId("swdded");
        dat.setSupplementaryAgreementId("weedw e ed wef");
        responseDto.data = dat;
        return responseDto;
    }

    @Override
    public CorporateSettlementAccountCreateResponseDto create(CorporateSettlementAccountCreateRequestDto request) {
        CorporateSettlementAccountCreateResponseDto responseDto = new CorporateSettlementAccountCreateResponseDto();

        DataCreateAccount dataCreateAccount = new DataCreateAccount();
        dataCreateAccount.setAccountId("iudf osudfy df2983r7 fdh lkasfh fkjh");
        responseDto.setData(dataCreateAccount);

        return responseDto;
    }
}
