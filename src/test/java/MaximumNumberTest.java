import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber max;
    @Test
    public void givenNumbers_WhenProper_ShouldReturn_MaxNumber() {
        int number = max.giveMaxValue(8, 5, 2);
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenSecondNumber_WhenMaximum_ShouldReturn_SecondNumber() {
        int number = max.giveMaxValue(5, 8, 2);
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenThirdNumber_WhenMaximum_ShouldReturn_ThirdNumber() {
        int number = max.giveMaxValue(5, 2, 8);
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenFirstFloatNumber_WhenMaximum_ShouldReturn_FirstNumber() {
        float number = max.giveMaxValue(7.55f, 2.15f, 5.21f);
        Assert.assertEquals(7.21f,number,0.0);
    }

    @Test
    public void givenSecondFloatNumber_WhenMaximum_ShouldReturn_SecondNumber() {
        float number = max.giveMaxValue(5.55f, 7.15f, 2.21f);
        Assert.assertEquals(7.15f,number,0.0);
    }

    @Test
    public void givenThirdFloatNumber_WhenMaximum_ShouldReturn_ThirdNumber() {
        float number = max.giveMaxValue(3.55f, 5.15f, 7.21f);
        Assert.assertEquals(7.21f,number,0.0);
    }

    @Test
    public void givenFirstString_WhenMaximum_ShouldReturn_FirstString() {
        String value=max.giveMaxValue("rst","pqr","abc");
        Assert.assertEquals("rst",value);
    }

    @Test
    public void givenSecondString_WhenMaximum_ShouldReturn_SecondString() {
        String value=max.giveMaxValue("abc","rst","pqr");
        Assert.assertEquals("rst",value);
    }

    @Test
    public void givenThirdString_WhenMaximum_ShouldReturn_ThirdString() {
        String value=max.giveMaxValue("abc","pqr","rst");
        Assert.assertEquals("rst",value);
    }

    @Before
    public void setUp() throws Exception {
        max =new MaximumNumber();
    }
}
