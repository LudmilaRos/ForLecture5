package src.lecture2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int number1 = 34;
        int number2 = 49;
        int sum = number1 + number2;
        System.out.println("Two number sum is "+sum);



        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        int randomNumber2 = randomGenerator.nextInt(101);
        sum = randomNumber + randomNumber2;
        System.out.println("Sum of numbers " + sum);
        System.out.println(randomNumber + randomNumber2);




    }
}
