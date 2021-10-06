package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.List;

public interface AccountTypeTranslator
{
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);

    List<AccountTypeDto> getAllAccountTypes();
    //  List<AccountTypeDto> getAllAccountTypes();

   // AccountTypeDto create(AccountTypeDto accountType);
}
