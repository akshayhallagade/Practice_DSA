public class circle {
    public static void main(String[] args) {
        System.out.println(solve(9));
    }

    public static int solve(int A) {
        // 9
        // 1. Find the nearest value (2^someting) and it should be less than A.
        int val = 1;
        while (val < A)
            val = val * 2; // 1, 2, 4, 8

        // 2. Kills (2^smething).
        int kills = A - val; // 9-8

        // 3. lastpersons standing.
        int lastperson = (2 * kills) + 1;
        return lastperson;
    }
}