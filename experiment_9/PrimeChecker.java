package experiment_9;

import java.util.ArrayList;

public class PrimeChecker {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Autoboxing: primitive ints to Integer objects
        for (int i = 2; i <= 10; i++) {
            numbers.add(i);
        }

        for (Integer num : numbers) {
            int value = num; // unboxing
            System.out.println(value + " is " + (isPrime(value) ? "prime" : "not prime"));
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

