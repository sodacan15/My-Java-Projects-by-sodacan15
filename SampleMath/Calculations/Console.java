package SampleMath.Calculations;
import java.util.Scanner;

public class Console {
  // Clears Screen in Java
  public void clearScreen() {
      try {
          if (System.getProperty("os.name").contains("Windows")) {
              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          } else {
              new ProcessBuilder("clear").inheritIO().start().waitFor();
          }
      } catch (Exception e) {
          System.out.print("\033[2J\033[H");
          System.out.flush();
      }
  }

  // Collects User Data
  public double getInput (Scanner sc, String prompt) {
      while (true) {
          System.out.print(prompt);
          String input = sc.nextLine();
          try {
              return Double.parseDouble(input);
          } catch (Exception e) {
              System.out.println("Invalid input! Please enter a valid number.");
          }
      }
  }
    String [] operators = {"+", "-", "*", "/", "%"};
    
    public String getOperator (Scanner sc, String prompt){
        Boolean found = false;
        while (found == false){
            System.out.print(prompt);
            String input = sc.nextLine();
            for(String ops : operators){
                if (input.equals(ops)){
                    found = true;
                    return input;
                }
            }
            if (found == false){
                System.out.println("Invalid Operator");
            }
        }
        return null;
        
    }

    public void Answer (double a, double b, double c, String operator){
        System.out.println(a + " " + operator + " " + b + " = " + c);
    }
    
    public Boolean Continue (Scanner sc) {
        System.out.print("Continue? (y/n): ");
        String decision = sc.nextLine();
        return decision.equalsIgnoreCase("y");
    }
    
}