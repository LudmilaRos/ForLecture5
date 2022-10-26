package src.NumberService;

public class NumberServiceLauncher {
    public static void main(String[] args) {
        NumberService1 numberService1 = new NumberService1 ();
        numberService1.rangeSum(1, 10);
        numberService1.rangeSum(10, 1);
        numberService1.rangeEvenCount(1,10);
        numberService1.rangeEvenCount(10,1);
}
}
