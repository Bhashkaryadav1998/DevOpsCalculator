package calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private App calculator;
    @Before
    public void setUp() {
        calculator = new App();
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testSqroot1(){
        double x=100.0;
        double res=10.0;
        Assert.assertEquals(res,calculator.Sqrt(x),0);
    }
    @Test
    public void testSqroot2(){
        Assert.assertTrue(Double.isNaN(calculator.Sqrt(-23)));
    }
}
