public class MaximumNumber<E extends Comparable <E>> {
    E first;
   E second;
   E third;

    public MaximumNumber() {
        this.first = null;
        this.second = null;
        this.third = null;
    }

    public MaximumNumber(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public <E extends Comparable <E>> E getMax(E first, E second, E third) {
        E value;
        if (first.compareTo(second) > 0) {
            if (first.compareTo(third) > 0)
                value=first;
            else
                value=third;
        } else {
            if (second.compareTo(third) > 0) {
                value=second;
            } else {
                value=third;
            }
        }
        return value;
    }
    public <E extends Comparable <E>> E giveMaxValue(){
        return (E)getMax(first,second,third);
    }


}