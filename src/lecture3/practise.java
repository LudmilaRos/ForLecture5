package src.lecture3;

public class practise {
    public static void main(String[] args) {
        int a = 14;
        int b = 15;
        if(a <= 9) {
            System.out.println("Your number is lower than 19");
        } else if (a > 10) {
            System.out.println("Your number is higher than 10");
        }

        int switchCaseVAr = 10;
        switch (switchCaseVAr) {
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            case 12:
            case 13:
                System.out.println("12");
                break;
            default:
                System.out.println("what??");
        }
    }
}
