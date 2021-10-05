package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;

public class AccountTransactionDto implements Serializable {
    private static final long serialVersionUID = -4702910960654155445L;


    private Long transactionId;
    private Long memberId;
    private Long amount;
    private LocalDate transactionDate;
    private AccountType accountType;
    private AccountTransactionDetails details;
    private AccountTransaction createdAccountTransaction;
 /*
    public AccountTransactionDto()
    {}
   // public AccountTransactionDto()
    //{}
    //public AccountTransactionDto()
    //{}


 */
    public AccountTransactionDto(AccountTransaction createdAccountTransaction)
    {

    }
    public static void setTransactionId(Object o) {
    }

    public static Object getAccountTypeMnemonic()
    {

    }

    public static AccountTransaction buildAccountTransaction(AccountType accountType) {
    }

    public boolean getDetails()
    {
        return true;
    }
}

