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

    public void  Calculate (ArrayList<String> ops, ArrayList<Double> num) {
        if (ops.size() == 0){
            ans = num.get(0);   
        } else {
            for (int k = 0; k < ops.size(); k++){
                if (i == 0) {
                    Operator(num.get(k), num.get(k+1), ops.get(k));
                    i++;
                } else {
                    Operator(ans, num.get(k+1), ops.get(k));
                }
            }
        }
        
    }

    

    public void printAnswer (){
        System.out.println("Answer: " + ans);
    }


    
}
