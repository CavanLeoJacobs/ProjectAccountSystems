package za.ac.nwu.ac.logic.flow.impl;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FetchAccountTypeFlowImplTest {

    private FetchAccountTypeFlowImpl testClass;
    @BeforeEach
    void setUp() throws Exception
    {
      testClass = new FetchAccountTypeFlowImpl(null);
    }

    @AfterEach
    void tearDown() throws Exception
    {
        testClass=null;
    }
    @Ignore
    @Test
    void methodToTest()
    {
        assertTrue(testClass.MethodToTest());
    }
}