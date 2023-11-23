import java.util.Stack;

public class stack1_1 {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            // Opening Brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Closing Brackets
            else {
                // when adding closing bracket to empty stack.
                if (st.isEmpty()) {
                    return 0;
                }
                // Mis-matched : when st.peek() is not the counter part of current closing
                // parenthesis.
                else if ((st.peek() == '{' && ch != '}') || (st.peek() == '(' && ch != ')')
                        || (st.peek() == '[' && ch != ']')) {
                    return 0;
                }
                // Matched-currectly : when (st.peek()==closing parenthesis)
                else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty())
            return 1;
        return 0;

        // Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < A.length(); i++) {
        // char ch = A.charAt(i);

        // // Push to Stack only if opening parenthesis
        // if (ch == '{' || ch == '(' || ch == '[') {
        // stack.push(ch);
        // } else if (ch == '}' || ch == ')' || ch == ']') {
        // // If Adding closing parenthesis to Empty Stack.
        // if (stack.isEmpty()) {
        // return 0;
        // }

        // // When we have a closing parenthesis, respective opening parenthesis should
        // be at the top of stack
        // if ((stack.peek() == '{' && ch == '}') || (stack.peek() == '(' && ch == ')')
        // || (stack.peek() == '[' && ch == ']')) {
        // stack.pop();
        // }
        // }
        // }
        // return stack.isEmpty() ? 1 : 0;
    }
}