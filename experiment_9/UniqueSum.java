package experiment_9;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] input = {3, 5, 3, 8, 2, 5};

        for (int n : input) {
            numbers.add(n);
        }

        HashSet<Integer> unique = new HashSet<>(numbers);
        int sum = 0;
        for (int num : unique) {
            sum += num;
        }

        System.out.println("Unique values: " + unique);
        System.out.println("Sum: " + sum);
    }
}
