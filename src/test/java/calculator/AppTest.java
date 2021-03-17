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
    @Test
    public void testFact1(){
        int x=5;
        long res=120;
        Assert.assertEquals(res,calculator.fact(x));
    }
    @Test
    public void testFact2(){
        int x=-10;
        long res=-1;
        Assert.assertEquals(res,calculator.fact(x));
    }
    @Test
    public void testLn1(){
        double x=34;
        double res=3.5263605;
        Assert.assertEquals(res,calculator.ln(x),0.000001);
    }
    @Test
    public void testln2(){
        Assert.assertTrue(Double.isNaN(calculator.ln(-47)));
    }
    @Test
    public void testPow1(){
        double res=1024;
        Assert.assertEquals(res,calculator.pow(2,10),0);
    }
    @Test
    public void testPow2(){
        double res=0.439104197;
        Assert.assertEquals(res,calculator.pow(0.23,0.56),0.000001);
    }
    @Test
    public void testPow3(){
        double res=-243;
        Assert.assertEquals(res,calculator.pow(-3,5),0);
    }
}
