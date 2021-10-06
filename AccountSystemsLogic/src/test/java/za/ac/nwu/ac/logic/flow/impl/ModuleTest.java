package za.ac.nwu.ac.logic.flow.impl;

import org.junit.Before;
import org.junit.Test;
import jdk.nashorn.internal.ir.annotations.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModuleTest
{
    private Module mod;

    @Before
    public void setUp() throws Exception
    {
        mod = new Module();


    }
    @Test
    public void testMod()
    {
        Integer result =  mod.doMod(9 ,5);
        assertNotNull("Should not be null",result);
        assertEquals("Should be value 4",4,result.intValue());

    }
    @Ignore
    @Test
    public void testModBy0()
    {
        Integer result =  mod.doMod(9 ,0);
        assertNotNull("Should not be null",result.intValue());

        assertEquals("Error",0,result.intValue());
    }
}
