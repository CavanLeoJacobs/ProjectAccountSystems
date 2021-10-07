package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.logic.flow.CreateAccountTransactionFlow;

import javax.transaction.Transactional;

@Transactional
@Component
public class CreateAccountTransactionFlowImpl implements CreateAccountTransactionFlow
{
    /*
   private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountTransactionFlowImpl.class);
    private final AccountTransactionTranslator accountTransactionTranslator;
    private final AccountTransactionDetailsTranslator accountTransactionDetailsTranslator;
    private final FetchAccountTypeFlow fetchAccountTypeFlow;

    public CreateAccountTransactionFlowImpl(AccountTransactionTranslator accountTransactionTranslator,AccountTransactionDetailsTranslator accountTransactionDetailsTranslator,FetchAccountTypeFlow fetchAccountTypeFlow)
    {
        this.accountTransactionTranslator=accountTransactionTranslator;
        this.accountTransactionDetailsTranslator=accountTransactionDetailsTranslator;
        this.fetchAccountTypeFlow=fetchAccountTypeFlow;
    }

    public AccountTransactionDto create(AccountTransactionDto accountTransactionDto)
    {
        LOGGER.info("the input was {}",accountTransactionDto);

        accountTransactionDto.setTransactionId(null);
        AccountType accountType = fetchAccountTypeFlow.getAccountTypeDbEntityByMnemonic(accountTransactionDto.getAccountTypeMnemonic());
        LOGGER.info("Got AccountType for {} and the AccountTypeID is ",accountTransactionDto.getAccountTypeMnenonic);
        AccountTransaction accountTransaction = accountTransactionDto.buildAccountTransaction(accountType);

        AccountTransaction createdAccountTransaction = accountTransactionTranslator.save(accountTransaction);
       // if(accountTransactionDto.getDetails() !=null)
        {
            AccountTransactionDetails accountTransactionDetails =accountTransactionDto.getDetails()
                    .buildAccountTransactionDetails(createdAccountTransaction);
            createdAccountTransaction.setDetails(accountTransactionDetails);
        //    accountTransactionDetailsTranslator.save(createdAccountTransaction.getDetails());
        }
        AccountTransactionDto results = new AccountTransactionDto(createdAccountTransaction);
        LOGGER.info("the return object is{}",results);

        return results;
    }


     */
}

