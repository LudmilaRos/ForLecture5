package src.lecture3;

public class SignCompare {
    public String compare(int number) {
        String result = "Number is equals to zero";
        if (number > 0) {
            result = "Number is positive";
        } else if (number < 0) {
            result = "number is negative";
        }
        return result;

    }
}
