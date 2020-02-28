public class MaximumNumber {
    public int giveMaxNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
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

    public Float giveMaxNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
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
}