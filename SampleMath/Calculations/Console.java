package SampleMath.Calculations;
import java.util.Scanner;
import java.util.ArrayList;

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

    public static String [] inputs;
    public static ArrayList<Double> nums = new ArrayList<> ();
    public static ArrayList<String> operators = new ArrayList<> (); 
    
    public void getInput (Scanner sc, String prompt){
        System.out.print(prompt);
        String input = sc.nextLine();
        inputs = input.split(" ");
        sortNum();
    }

    public void sortNum () {
        
        for (String word: Console.inputs) {
            if (word.matches("[0-9]+")){
                nums.add(Double.parseDouble(word));
            } else if (word.matches("[+\\-*/%]")){
                operators.add(word);
            }
        }
        
    }
}
