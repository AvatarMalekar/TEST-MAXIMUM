import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maxNumber;
    @Test
    public void givenNumbers_WhenProper_ShouldReturn_MaxNumber() {
        int number = maxNumber.giveMaxNumber(8, 5, 2);
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenSecondNumber_WhenMaximum_ShouldReturn_SecondNumber() {
        int number = maxNumber.giveMaxNumber(5, 8, 2);
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenThirdNumber_WhenMaximum_ShouldReturn_ThirdNumber() {
        int number = maxNumber.giveMaxNumber(5, 2, 8);
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenFirstFloatNumber_WhenMaximum_ShouldReturn_FirstNumber() {
        float number = maxNumber.giveMaxNumber(7.55f, 2.15f, 5.21f);
        Assert.assertEquals(7.21f,number,0.0);
    }

    @Test
    public void givenSecondFloatNumber_WhenMaximum_ShouldReturn_SecondNumber() {
        float number = maxNumber.giveMaxNumber(5.55f, 7.15f, 2.21f);
        Assert.assertEquals(7.15f,number,0.0);
    }

    @Test
    public void givenThirdFloatNumber_WhenMaximum_ShouldReturn_ThirdNumber() {
        float number = maxNumber.giveMaxNumber(3.55f, 5.15f, 7.21f);
        Assert.assertEquals(7.21f,number,0.0);
    }

    @Before
    public void setUp() throws Exception {
        maxNumber=new MaximumNumber();
    }
}
