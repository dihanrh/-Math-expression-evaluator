package lab;

import java.util.Stack;

/**
 *
 * @author Dihan
 */
public class FormulME {

    public static double evaluate(String expression) {
        char[] dihan = expression.toCharArray();
        // var dihan - tokens , char type array
        Stack<Double> values = new Stack<Double>();
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < dihan.length; i++) {
            if (dihan[i] == ' ') {
                continue;
            }
            if (dihan[i] >= '0'
                    && dihan[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();
                while (i < dihan.length
                        && dihan[i] >= '0'
                        && dihan[i] <= '9') {
                    sbuf.append(dihan[i++]);
                }
                values.push(Double.parseDouble(sbuf.toString()));
                i--;
            } else if (dihan[i] == '(') {
                ops.push(dihan[i]);
            } else if (dihan[i] == ')') {
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(),
                            values.pop(),
                            values.pop()));
                }
                ops.pop();
            } else if (dihan[i] == '+'
                    || dihan[i] == '-'
                    || dihan[i] == '*'
                    || dihan[i] == '/') {
                while (!ops.empty()
                        && hasPrecedence(dihan[i],
                                ops.peek())) {
                    values.push(applyOp(ops.pop(),
                            values.pop(),
                            values.pop()));
                }
                ops.push(dihan[i]);
            }
        }
        while (!ops.empty()) {
            values.push(applyOp(ops.pop(),
                    values.pop(),
                    values.pop()));
        }
        return values.pop();
    }

    public static boolean hasPrecedence(
            char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/')
                && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    public static Double applyOp(char op,
            Double double1, Double double2) {
        switch (op) {
            case '+':
                return double2 + double1;
            case '-':
                return double2 - double1;
            case '*':
                return double2 * double1;
            case '/':
                if (double1 == 0) {
                    throw new UnsupportedOperationException(
                            "Cannot divide by zero");
                }
                return double2 / double1;
        }
        return (double) 0;
    }
}
