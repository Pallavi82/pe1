import com.stackroute.TestDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TestDemoTest {


    TestDemo t1;
    @Before
    public void setUp() throws Exception {
         t1=new TestDemo();

    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void m1()
    {

        String str3= t1.m1();
        assertEquals("HELLO",str3);

    }
}