import java.util.Scanner;

public class Addition{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Add add = new Add();

      add.a = add.checker(sc, "Enter first number: ");
      add.b = add.checker(sc, "Enter second number: ");
     
      add.clearScreen();
      add.doubleValue();
     
      add.addNumbers();

  }
}

class Add {
  int a, b, c, d; // You can have as many variables as needed

  public void clearScreen() {
    try {
      // For Windows
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        // For Unix/Linux/Mac
        new ProcessBuilder("clear").inheritIO().start().waitFor();
      }
    } catch (Exception e) {
      // Fallback to ANSI escape codes
      System.out.print("\033[2J\033[H");
      System.out.flush();
    }
  }

  public int checker(Scanner sc, String prompt) {
     while (true) {
        System.out.print(prompt);
        String input = sc.nextLine();
        try {
           return Integer.parseInt(input);
        } catch (Exception e) {
           System.out.println("Invalid input! Please enter a valid number.");
        }
     }
  }

  public void doubleValue() {
    System.out.println("Double value of a is: " + (a * 2));
  }

  public void addNumbers() {
    System.out.println("Sum of a and b is: " + (a + b));
  }
}
