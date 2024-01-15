import java.util.*;

/**
 * prac
 */
public class prac {
    public static void main(String[] args) {
        Integer[] integerArray = { 12, 6, 8, 15, 25 };

        // Creating a Comparator based on factors count in ascending order
        // Comparator<Integer> factorsComparator =
        // Comparator.comparingInt(prac::countFactors);

        // Sorting the array using the factorsComparator
        // Arrays.sort(integerArray, factorsComparator);

        // Printing the sorted array based on factors count
        // System.out.println(integerArray);
        System.out.println(solve());
    }

    // Count factors of a number
    // private static int countFactors(int number) {
    // int count = 0;
    // for (int i = 1; i <= number; i++) {
    // if (number % i == 0) {
    // count++;
    // }
    // }
    // return count;
    // }

    public int factors(int A) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (i == Math.sqrt(A))
                    count++;
                else
                    count = count + 2;
            }
        }
        return count;
    }

    public int[] solve(int[] A) {
        int N = A.length;
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++)
            arr[i] = A[i];

        Comparator<Integer> factorsCompare = Comparator.comparingInt(prac::factors);
        Arrays.sort(arr, factorsCompare);
        for (int i = 0; i < N; i++)
            A[i] = arr[i];
        return A;
    }
}
