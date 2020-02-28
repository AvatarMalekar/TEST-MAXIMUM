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

    @Before
    public void setUp() throws Exception {
        maxNumber=new MaximumNumber();
    }
}
