import junit.framework.Assert;
import org.junit.Test;

public class Arithmetic_calcTest {

    @Test
    public void testAddition1() {

        var calc = new Arithmetic_calc();
        Assert.assertEquals("2 + 2 MUST equals 4.0",4.0,calc.addition(2,2));

    }

    @Test
    public void testAddition2() {

        var calc = new Arithmetic_calc();
        Assert.assertEquals("2 + 6.7 MUST equals 8.7",8.7,calc.addition(2,6.7));

    }

    @Test
    public void testDiv1(){

        var calc = new Arithmetic_calc();
        Assert.assertEquals("5 / 2 MUST equals 2.5",2.5,calc.div(5,2));

    }

    @Test
    public void testDiv2(){

        var calc = new Arithmetic_calc();
        Assert.assertEquals("9 / 3 MUST equals 3.0",3.0,calc.div(9,3));

    }

    @Test
    public void testMul1(){
        var calc = new Arithmetic_calc();
        Assert.assertEquals("10 * 8 MUST equals 80.0",80.0,calc.mul(10,8));
    }

    @Test
    public void testMul2(){
        var calc = new Arithmetic_calc();
        Assert.assertEquals("9 * 9 MUST equals 81.0",81.0,calc.mul(9,9));
    }

    @Test
    public void testSquare1(){
        var calc = new Arithmetic_calc();
        Assert.assertEquals("Square of 9 MUST equals 3.0",3.0,calc.squareRoot(9));
    }

    @Test
    public void testSquare2(){
        var calc = new Arithmetic_calc();
        Assert.assertEquals("Square of 100 MUST equals 10.0",10.0,calc.squareRoot(100));
    }

    @Test
    public void testPow1(){
        var calc = new Arithmetic_calc();
        Assert.assertEquals("Square of 9 ^ 4 MUST equals 6561.0",6561.0,calc.pow(9,4));
    }

    @Test
    public void testPow2(){
        var calc = new Arithmetic_calc();
        Assert.assertEquals("Square of 3 ^ 2 MUST equals 9.0",9.0,calc.pow(3,2));
    }
}