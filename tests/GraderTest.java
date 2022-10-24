import org.junit.Assert;
import org.junit.Test;

public class GraderTest {

    @Test
    public void testGrader1() {
        var grad = new Grader();
        Assert.assertEquals('F', grad.grader(30));

    }

    @Test
    public void testGrader2() {
        var grad = new Grader();
        Assert.assertEquals('D', grad.grader(65));

    }

    @Test
    public void testGrader3() {
        var grad = new Grader();
        Assert.assertEquals('C', grad.grader(77));

    }

    @Test
    public void testGrader4() {
        var grad = new Grader();
        Assert.assertEquals('B', grad.grader(89));

    }

    @Test
    public void testGrader5() {
        var grad = new Grader();
        Assert.assertEquals('A', grad.grader(100));

    }

}