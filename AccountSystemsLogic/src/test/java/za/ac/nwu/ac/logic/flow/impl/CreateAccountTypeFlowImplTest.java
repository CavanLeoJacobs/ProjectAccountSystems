package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.AccountTypeTranslator;


@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest  {

    private AccountTypeTranslator translator;
    private CreateAccountTypeFlowImpl flow;
    @Before
    public void setUp() throws Exception
    {
        translator= Mockito.mock(AccountTypeTranslator.class);
        flow= new CreateAccountTypeFlowImpl(translator);
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void create()
    {

        flow.create(new AccountTypeDto());
    }
}