import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber max;
    @Test
    public void givenNumbers_WhenProper_ShouldReturn_MaxNumber() {
        MaximumNumber max=new MaximumNumber(8,5,2);
       int number =(int) max.giveMaxValue();
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenSecondNumber_WhenMaximum_ShouldReturn_SecondNumber() {
        MaximumNumber max=new MaximumNumber(5, 8, 2);
        int number = (int) max.giveMaxValue();
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenThirdNumber_WhenMaximum_ShouldReturn_ThirdNumber() {
        MaximumNumber max=new MaximumNumber(5, 2, 8);
        int number = (int) max.giveMaxValue();
        Assert.assertEquals(8,number);
    }

    @Test
    public void givenFirstFloatNumber_WhenMaximum_ShouldReturn_FirstNumber() {
        MaximumNumber max=new MaximumNumber(7.55f, 2.15f, 5.21f);
        float number = (float) max.giveMaxValue();
        Assert.assertEquals(7.55f,number,0.0);
    }

    @Test
    public void givenSecondFloatNumber_WhenMaximum_ShouldReturn_SecondNumber() {
        MaximumNumber max=new MaximumNumber(5.55f, 7.15f, 2.21f);
        float number = (float) max.giveMaxValue();
        Assert.assertEquals(7.15f,number,0.0);
    }

    @Test
    public void givenThirdFloatNumber_WhenMaximum_ShouldReturn_ThirdNumber() {
        MaximumNumber max=new MaximumNumber(3.55f, 5.15f, 7.21f);
        float number = (float) max.giveMaxValue();
        Assert.assertEquals(7.21f,number,0.0);
    }

    @Test
    public void givenFirstString_WhenMaximum_ShouldReturn_FirstString() {
        MaximumNumber max=new MaximumNumber("rst","pqr","abc");
        String value= (String) max.giveMaxValue();
        Assert.assertEquals("rst",value);
    }

    @Test
    public void givenSecondString_WhenMaximum_ShouldReturn_SecondString() {
        MaximumNumber max=new MaximumNumber("abc","rst","pqr");
        String value= (String) max.giveMaxValue();
        Assert.assertEquals("rst",value);
    }

    @Test
    public void givenThirdString_WhenMaximum_ShouldReturn_ThirdString() {
        MaximumNumber max=new MaximumNumber("abc","pqr","rst");
        String value= (String) max.giveMaxValue();
        Assert.assertEquals("rst",value);
    }

    @Before
    public void setUp() throws Exception {
        max=new MaximumNumber();
    }
}
