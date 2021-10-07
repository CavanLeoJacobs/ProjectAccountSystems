package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.logic.flow.CreateAccountTypeFlow;

import javax.transaction.Transactional;

@Transactional
@Component("CreateAccountTypeFlowName")
public class CreateAccountTypeFlowImpl  implements CreateAccountTypeFlow
{
    /*
    private final AccountTypeTranslator accountTypeTranslator;

    public  CreateAccountTypeFlowImpl (AccountTypeTranslator accountTypeTranslator)
    {
        this.accountTypeTranslator=accountTypeTranslator;
    }
    @Override
    public AccountTypeDto create(AccountTypeDto accountType)
    {
        if (null==accountType.getCreationDate())
        {
            accountType.setCreationDate(LocalDate.now());

        }
       // return accountTypeTranslator.create(accountType);
    }

     */
}
