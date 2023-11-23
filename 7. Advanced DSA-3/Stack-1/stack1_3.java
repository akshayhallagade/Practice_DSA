import java.util.Stack;

public class stack1_3 {
    public static int evalRPN(String[] A) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            int b = st.pop();
            int a = st.pop();
            if (A[i].equals("+"))
                st.push(a + b);
            else if (A[i].equals("-"))
                st.push(a - b);
            else if (A[i].equals("*"))
                st.push(a * b);
            else if (A[i].equals("/"))
                st.push(a / b);
            else
                st.push(Integer.parseInt(String.valueOf(A[i])));
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String arr[] = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(arr));
    }
}
