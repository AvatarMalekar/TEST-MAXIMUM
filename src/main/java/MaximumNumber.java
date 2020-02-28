public class MaximumNumber {
    public int giveMaxValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
         Integer value = 0;
        if (firstNumber.compareTo(secondNumber) > 0) {
            if (firstNumber.compareTo(thirdNumber) > 0)
                value=firstNumber;
            else
                value=thirdNumber;
        } else {
            if (secondNumber.compareTo(thirdNumber) > 0) {
                value=secondNumber;
            } else {
                value=thirdNumber;
            }
        }
        return value;
    }

    public Float giveMaxValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float value = 0f;
        if (firstNumber.compareTo(secondNumber) > 0) {
            if (firstNumber.compareTo(thirdNumber) > 0)
                value=firstNumber;
            else
                value=thirdNumber;
        } else {
            if (secondNumber.compareTo(thirdNumber) > 0) {
                value=secondNumber;
            } else {
                value=thirdNumber;
            }
        }
        return value;
    }

    public String giveMaxValue(String firstString, String secondString, String thirdString) {
        String value = null;
        if (firstString.compareTo(secondString) > 0) {
            if (secondString.compareTo(thirdString) > 0)
                value=firstString;
            else
                value=thirdString;
        } else {
            if (secondString.compareTo(thirdString) > 0) {
                value=secondString;
            } else {
                value=thirdString;
            }
        }
        return value;
    }
}