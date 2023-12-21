/**
 * div
 */
public class div {

    public static void main(String[] args) {
        System.out.println(solve("9216"));
    }

    public static int solve(String A) {
        int N = A.length();

        int len;
        if (N >= 3)
            len = 3;
        else
            len = N;

        int sum = 0;
        int digit = 0;
        for (int i = len; i > 0; i--) {
            digit = (int) A.charAt(N - i) - 48;
            sum = (sum * 10) + digit;
        }
        if (sum % 8 == 0)
            return 1;
        return 0;
    }
}