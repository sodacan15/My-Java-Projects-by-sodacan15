package SampleMath.Calculations;

import java.util.regex.*;
import java.util.ArrayList;

public class Parser {

    // Replace innermost parentheses with their computed value
    public static String replaceInnermostWithResult(String input) {
        Pattern p = Pattern.compile("\\([^()]*\\)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            String inside = m.group().substring(1, m.group().length() - 1); // e.g., "3+4"
            // Handle implicit multiplication inside
            inside = Calc.handleImplicitMultiplication(inside);
            double value = Calc.evaluateExpression(inside); // compute inside
            input = input.replace(m.group(), String.valueOf(value));
            m = p.matcher(input); // reset matcher after replacement
        }

        return input;
    }

    // Evaluate the entire expression, including parentheses
    public static double Final_Calculation(String input) {
        // First, handle implicit multiplication for the whole expression
        input = Calc.handleImplicitMultiplication(input);

        // Keep replacing innermost parentheses until none left
        while (input.contains("(") && input.contains(")")) {
            input = replaceInnermostWithResult(input);
        }

        // Evaluate final flat expression
        return Calc.evaluateExpression(input);
    }
}

// Calculator class that evaluates flat expressions
class Calc {

    // Handle implicit multiplication like 2(3+4), (1+2)3, 5x
    public static String handleImplicitMultiplication(String input) {
        // Number before parenthesis
        input = input.replaceAll("(\\d)(\\()", "$1*$2");

        // Closing parenthesis before number or variable
        input = input.replaceAll("(\\))(\\d|[a-zA-Z])", "$1*$2");

        // Number before variable
        input = input.replaceAll("(\\d)([a-zA-Z])", "$1*$2");

        return input;
    }

    public static double evaluateExpression(String input) {
        // Split numbers and operators
        String[] split = input.split("(?<=[-+*/])|(?=[-+*/])");
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        for (String s : split) {
            s = s.trim();
            if (s.matches("-?\\d+(\\.\\d+)?")) {
                numbers.add(Double.parseDouble(s));
            } else if (s.matches("[-+*/]")) {
                operators.add(s);
            }
        }

        // First pass: *, /
        for (int i = 0; i < operators.size(); i++) {
            String op = operators.get(i);
            if (op.equals("*") || op.equals("/")) {
                double a = numbers.get(i);
                double b = numbers.get(i + 1);
                double result = op.equals("*") ? a * b : a / b;
                numbers.set(i, result);
                numbers.remove(i + 1);
                operators.remove(i);
                i--; // stay at same index
            }
        }

        // Second pass: +, -
        double result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            String op = operators.get(i);
            double b = numbers.get(i + 1);
            result = op.equals("+") ? result + b : result - b;
        }

        return result;
    }
}
