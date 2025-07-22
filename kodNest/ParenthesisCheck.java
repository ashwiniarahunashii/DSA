package kodNest;
import java.util.Scanner;

public class ParenthesisCheck {
    int top = -1;
    char[] stack;

    public ParenthesisCheck(int size) {
        stack = new char[size];
    }

    public void push(char ch) {
        if (top < stack.length - 1) {
            stack[++top] = ch;
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public char pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            return '\0'; // null character for empty pop
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isBalanced(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (isEmpty()) return false;
                char open = pop();
                if (!isMatchingPair(open, ch)) return false;
            }
        }
        return isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression to check for balanced parentheses:");
        String expr = sc.nextLine();

        ParenthesisCheck  checker = new ParenthesisCheck (expr.length());

        if (checker.isBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
