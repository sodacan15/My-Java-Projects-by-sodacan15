import java.util.Scanner;
import SampleMath.Calculations.Parser;

public class Main {
    public static void main(String[] args) {
        boolean Continue = true;
        Scanner sc = new Scanner(System.in);
        
        while (Continue){
            System.out.print("Enter an expression: ");
            String input = sc.nextLine();
            double result = Parser.Final_Calculation(input);
            System.out.println("Final result: " + result);
            System.out.print("Do you want to continue? (yes/no): ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("")){
                continue;
            } else {
                break;
            }
        }
        
    }
}
