package src.lecture4;

public class SampleArrays3 {
    public static void main(String[] args) {
//        int[] elements = {1, 2, 3, 4, 5, 6, 78, 8, 2, 1, 3, 5, 1, -1, 4, -2, 135};
        int[] elements = {21, 22, 3, 4, 5, 6, 7, 9, 13, 543, 234, 1, 3};
        int min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (min > elements[i]) {
                min = elements[i];
            }
        }
        System.out.println("Minimal number is " + min);
    }

}
