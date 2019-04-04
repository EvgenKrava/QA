import org.junit.Assert;
import org.junit.Test;

public class CalcculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        Assert.assertEquals("Test sum fail!", calculator.sum(3.0, 8.0), 11.0, 0);
    }

    @Test
    public void testDiv(){
        Assert.assertEquals("Div fail!", calculator.division(9.0,3.0), 3.0, 0);
    }

    @Test
    public void testSub(){
        Assert.assertEquals("Sub fail!",calculator.substraction(9.0,6.0),3, 0);
    }

    @Test
    public void testMult(){
        Assert.assertEquals("Mult fail!", calculator.multiplication(12.0,6.0), 72 ,1);
    }

    @Test
    public void testNullDiv(){
        Assert.assertNotNull("Деление на ноль!", calculator.division(9.0,3.0));
    }

}
