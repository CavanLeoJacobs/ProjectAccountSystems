package za.ac.nwu.ac.domain.dto;

import io.swagger.annotations.ApiModel;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;

@ApiModel(value="AccountType",description="A DTO that represents the AccountType")

public class AccountTypeDto implements Serializable
{
private static final long serialVersionUID = -2931512136160549005L;

private String mnemonic;
private String accountTypeName;
private LocalDate creationDate;

public AccountTypeDto(){}
    public AccountTypeDto(String mnemonic,String accountTypeName,LocalDate creationDate)
    {
        this.accountTypeName=accountTypeName;
        this.mnemonic=mnemonic;
        this.creationDate=creationDate;

    }
    public AccountTypeDto(AccountType accountType)
    {
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

  //  @ApiModelProperty(position=1
   // value= ("AccountType.Mnemonic"));


    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

}

