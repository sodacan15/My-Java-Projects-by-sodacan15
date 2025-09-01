import java.util.Scanner;
import SampleMath.Calculations.Operations;
import SampleMath.Calculations.Console;

public class Main{
  public static void main(String[] args){

    Boolean cont = true;
    Operations term = new Operations();
    Console display = new Console();
    Scanner sc = new Scanner (System.in);
    
    while (cont == true){
      
      term.setInputs();
      term.Operator(Operations.inputOne,
                    Operations.inputTwo,
                    Operations.operator);
      display.Answer(Operations.inputOne,
                     Operations.inputTwo,
                     Operations.ans,
                     Operations.operator);
      term.reset();
      cont = display.Continue(sc);
      display.clearScreen();
    }

    System.out.println("Thank you for using the Calculator!");
      
  }
}
