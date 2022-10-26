package src.lecture3;

public class SignCompareLauncher {
    public static void main(String[] args) {
        SignCompare  signComporator = new SignCompare();
        System.out.println(signComporator.compare(0));
        System.out.println(signComporator.compare(-1));
        System.out.println(signComporator.compare(1));
    }
}

