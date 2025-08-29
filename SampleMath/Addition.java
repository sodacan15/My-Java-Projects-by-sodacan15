import java.util.Scanner;

public class Addition{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Add add = new Add();
    
      System.out.print("Enter a Number: ");
      add.checker(sc.nextLine(), add.a);
      add.doubleValue();
      
  }
}

class Add {
  int a, b;

  public void checker (String input, int a) {
     try {
        a = Integer.parseInt(input);
     } catch (Exception e) {
        System.out.println("Invalid input");
     }
  }

  public void doubleValue () {
    System.out.println("Double value of a is: " + (a * 2));
  }

  
}