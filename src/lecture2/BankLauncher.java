package src.lecture2;

public class BankLauncher {
    public static void main(String[] args) {
        Bank bankVariable = new Bank();
        bankVariable.checkBalance();
        bankVariable.deposit(1000);
        bankVariable.checkBalance();
        bankVariable.withdraw(10000);
        bankVariable.checkBalance();

    }
}

