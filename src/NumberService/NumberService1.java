package src.NumberService;

public class NumberService1 {

        public int rangeSum(int start, int finish) {
            int result = 0;
            int i = start;

            if (start <= finish) {
                for (i = start; i <= finish; i++) {
                    result = i + result;

                    System.out.println(result);
                }
            }
            ;

            if (start >= finish) {
                for (i = start; i >= finish; i--) {
                    result = i + result;
                    System.out.println(result);
                }
            }
            return result;
        }

        public int rangeEvenCount(int start, int finish) {
            int result = 0;
            int i = 0;
            if (start < finish) {
                for (i = start; i <= finish; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even numbers:" + i);

                    }
                }
            } else {
                for (i = start; i >= finish; i--) {

                    if (i % 2 == 0) {
                        System.out.println("Even numbers:" + i);
                    }
                }
            }

            return i;

}
    }

