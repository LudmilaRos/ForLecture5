package src.lecture2;

public class Bank {

    private int bankBalance = 1000;


    public void deposit(int amount) {
        if (amount >= 10000) {
            System.out.println("need to register sum in vid");
        } else {
            bankBalance = bankBalance + amount;
            System.out.println("You have deposited  " + amount + "euros");
        }
    }

    public void withdraw(int amount) {
        if (amount >= 700) {
            System.out.println("Daily limit exceeded");
        } else {
            if (bankBalance - amount < 0) {
                System.out.println("You dont have enough money");
            } else {
                bankBalance = bankBalance - amount;
                System.out.println("You have withdrawn " + amount + " euros from your bank account");
            }
        }
    }

    public void checkBalance() {
        System.out.println("You have " + bankBalance + " euros on your bank account");
    }

}





