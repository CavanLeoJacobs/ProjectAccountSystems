package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;


public class CreateAccountTransactionFlowImplTest {

    private AccountTransactionTranslator translator;
    private CreateAccountTransactionFlowImpl flow;
    @Before
    public void setUp() throws Exception
    {
        translator= Mockito.mock(AccountTransactionTranslator.class);
        flow= new CreateAccountTransactionFlowImpl(translator);
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void create()
    {
        flow.create(new AccountTransactionDto());
    }
}