package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import java.io.Serializable;
import java.time.LocalDate;

public class AccountTransactionDto implements Serializable {
    private static final long serialVersionUID = -4702910960654155445L;

    private Long transactionId;
    private Long memberId;
    private Long amount;
    private String accountTypeMnenonic;
    private LocalDate transactionDate;
    private AccountTransactionDetailsDto details;
    public AccountTransactionDto()
    {

    }

    public AccountTransactionDto(Long transactionId,String accountTypeMnenonic,Long memberId,Long amount,LocalDate transactionDate)
    {
        this.memberId=memberId;
        this.amount=amount;
        this.transactionDate=transactionDate;
        this.transactionId=transactionId;
        this.accountTypeMnenonic=accountTypeMnenonic;
    }
    public AccountTransactionDto(Long transactionId,String accountTypeMnenonic,Long memberId,Long amount,LocalDate transactionDate,AccountTransactionDetailsDto details)
    {
        this.memberId=memberId;
        this.amount=amount;
        this.transactionDate=transactionDate;
        this.transactionId=transactionId;
        this.accountTypeMnenonic=accountTypeMnenonic;
        this.details=details;
    }




    public AccountTransactionDto(AccountTransaction accountTransaction)
    {
        this.memberId=accountTransaction.getMemberId();
        this.amount=accountTransaction.getAmount();
        this.transactionDate=accountTransaction.getTransactionDate();
        this.transactionId=accountTransaction.getTransactionId();
        this.accountTypeMnenonic=accountTransaction.getAccountType().getMnemonic();
        if (null != accountTransaction.getDetails()) {
            this.details = new AccountTransactionDetailsDto(accountTransaction.getDetails());
        }
    }



}

