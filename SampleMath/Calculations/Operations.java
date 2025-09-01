package SampleMath.Calculations;
import SampleMath.Calculations.Console;
import java.util.Scanner;

public class Operations {   // ✅ must be public to import

    public static double inputOne, inputTwo, ans;
    public static String operator;
    public static int i = 0; 
    Console ops = new Console();
    Scanner sc = new Scanner (System.in);

    public void setInputs () {
        if (i==0){
            //First Iteration
            inputOne = ops.getInput (sc, "Enter First Number:" );
            inputTwo = ops.getInput (sc, "Enter Second Number:" );
        } else {
            //Continuations
            System.out.println("Previous Answer: " + ans);
            inputTwo = ops.getInput (sc, "Enter Follow-Up Number:" );
        }
        
        operator = ops.getOperator(sc, "Enter Operator: ");
        
        ops.clearScreen();
    }

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

    public void reset (){
        inputOne = ans;
        i++;
    }
    
}
