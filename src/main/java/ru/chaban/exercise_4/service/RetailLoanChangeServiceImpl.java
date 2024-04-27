package ru.chaban.exercise_4.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chaban.exercise_4.domain.Account;
import ru.chaban.exercise_4.domain.AccountPool;
import ru.chaban.exercise_4.repository.AccountPoolRepository;
import ru.chaban.exercise_4.repository.AccountRepository;
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

    private final AccountRepository accountRepository;
    private final AccountPoolRepository accountPoolRepository;

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
        /*
                Сформировать новый продуктовый регистр и записать его в БД. При этом:
        •	id генерируется в СУБД
        •	productid это Request.Body.instanceId
        •	productRegisterType это tpp_ref_product_register_type.value
        •	account – account.id
        •	currencyCode это Request.Body.currencyCode
        •	state  - OPEN (enum (0, Закрыт/1, Открыт/2, Зарезервирован/3, Удалён))
        •	accountNumber – account.number
         */

        Account account = new Account();
        account.setAccountNumber("45654987354");
        account.setBussy(true);

        AccountPool accountPool = new AccountPool();
        accountPool.setBranchCode(request.getBranchCode());
        accountPool.setCurrencyCode("");
        accountPool.setMdmCode(request.getMdmCode());
        accountPool.setRegistryTypeCode(request.getRegistryTypeCode());

        accountPoolRepository.save(accountPool);

        account.setAccountPool(accountPool);

        CorporateSettlementAccountCreateResponseDto responseDto = new CorporateSettlementAccountCreateResponseDto();

        DataCreateAccount dataCreateAccount = new DataCreateAccount();
        dataCreateAccount.setAccountId(accountRepository.save(account).getId().toString());
        responseDto.setData(dataCreateAccount);

        return responseDto;
    }
}

