package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component

public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    public final AccountTypeTranslator accountTypeTranslator;


    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;

    }

/*
    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        List<AccountTypeDto> accountTypeDto = new ArrayList<>();
        accountTypeDto.add(new AccountTypeDto("MILES", "Miles", LocalDate.now()));
        return accountTypeDto;
    }



 */

    public boolean MethodToTest() {
        return true;
    }


    public AccountTypeDto getTypeByMnemonic(String mnemonic) {
        return accountTypeTranslator.getAccountTypeDtoByMnemonic(mnemonic);
    }


    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        return accountTypeTranslator.getAllAccountTypes();
    }
}



















