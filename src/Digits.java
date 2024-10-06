import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> digitList;

    public Digits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number passed to the constructor (" + number + ") cannot be negative!");
        }
        digitList = new ArrayList<>();
        if (number == 0) {
            digitList.add(0);
        } else {
            while (number > 0) {
                digitList.add(0, number % 10);
                number /= 10;
            }
        }
    }

    public List<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= digitList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}