package SampleMath.Calculations;
import SampleMath.Calculations.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class Operations {   // ✅ must be public to import

    public static double inputOne, inputTwo, ans;
    public static String operator;
    public static int i = 0; 
    Console ops = new Console();
    Scanner sc = new Scanner (System.in);
/*
    public void setInputs () {
        if (i==0){
            //First Iteration
            inputOne = ops.getInput (sc, "Enter First Number:" );
            operator = ops.getOperator(sc, "Enter Operator: ");
            inputTwo = ops.getInput (sc, "Enter Second Number:" );
        } else {
            //Continuations
            System.out.println("Previous Answer: " + ans);
            operator = ops.getOperator(sc, "Enter Operator: ");
            inputTwo = ops.getInput (sc, "Enter Follow-Up Number:" );
        }
        
        ops.clearScreen();
    }
*/

    public void Operator (double a, double b, String operator){
        switch (operator) {
            case "+":
                ans = a + b; //Adds Numbers
                break;
            case "-":
                ans = a - b; //Subtracts Numbers
                break;
            case "*":
                ans = a * b; //Multiplies Numbers
                break;
            case "/":
                ans = a / b; //Divides Numbers
                break;
            case "%":
                ans = a % b; //Modulus Numbers
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public void Calculate (ArrayList<String> ops, ArrayList<Double> num) {
        for (String op: ops){
               if (i == 0){
                   Operator(num.get(i), num.get(i+1), op);
                   i++;
               } else {
                   inputOne = ans; inputTwo = num.get(i+1);
                   Operator(num.get(i), num.get(i+1), op);
                      i++;
               }
        }
    }

    public void printAnswer (){
        System.out.println("Answer: " + ans);
    }

    public void reset (){
        inputOne = ans;
        i++;
    }
    
}
