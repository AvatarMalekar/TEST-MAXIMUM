public class MaximumNumber {
    public <E extends Comparable <E>> E giveMaxValue(E firstString, E secondString, E thirdString) {
        E value;
        if (firstString.compareTo(secondString) > 0) {
            if (firstString.compareTo(thirdString) > 0)
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