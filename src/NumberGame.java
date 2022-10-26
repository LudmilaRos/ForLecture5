package src;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class NumberGame {
    public static void main(String[] args) {

            int UnknownNumber, UserNumber, TrysCount = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Try to guess number (from 0 to 100).");
            UnknownNumber = (int)Math.floor(Math.random() * 100);
            do {
                TrysCount++;
                System.out.print("Enter your number: ");
                UserNumber = input.nextInt();
                if (UserNumber > UnknownNumber)
                    System.out.println("The number you have guessed is smaller");
                else if (UserNumber < UnknownNumber) System.out.println("The number you have guessed is smaller");
                else System.out.println("You won");
            } while (UserNumber != UnknownNumber);
            System.out.println("Number of tryes " + TrysCount);
        }
    }