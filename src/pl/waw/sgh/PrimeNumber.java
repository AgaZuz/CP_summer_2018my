package pl.waw.sgh;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        int i;
        for (i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (n = 2; n < i; n++) {
                int b = i % n;
                if (b == 0) {
                    isPrime = false;
                    break;

                }

            }if (isPrime) {
                System.out.println(i);
            }
        }

    }
}

