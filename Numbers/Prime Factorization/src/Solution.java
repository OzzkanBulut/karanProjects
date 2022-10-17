import java.util.ArrayList;

public class Solution {
    public void primeFactors(int number) {

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            int primeCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primeCount++;
                }
            }
            if (primeCount == 2) {
                primes.add(i);
            }
        }
        if (primes.isEmpty()) {
            System.out.println("There are no prime factors of " + number);
        } else {
            System.out.println("Prime factors are :");
            for (int p : primes) {
                if (number % p == 0) {
                    System.out.println(p);
                }
            }
        }


    }
}
