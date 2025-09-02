import java.util.Scanner;
import SampleMath.Calculations.Operations;
import SampleMath.Calculations.Console;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    Console ops = new Console();
    Operations calc = new Operations();
    
    ops.getInput(sc, "> ");
    calc.Calculate(SampleMath.Calculations.Console.operators, 
                   SampleMath.Calculations.Console.nums);
    calc.printAnswer();
    
  }
}
