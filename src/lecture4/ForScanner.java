package src.lecture4;

import java.util.Scanner;

public class ForScanner {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        String something = scanner.next();
//        int number = scanner.nextInt();
//        System.out.println("Your typed number is " + number);
        System.out.println("Your typed something is " + something);
    }
}

