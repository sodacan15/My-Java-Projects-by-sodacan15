import java.util.Scanner;

public class Addition{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Add add = new Add();

      System.out.print("Enter a Number: ");
      add.checker(sc.nextLine());
      add.doubleValue();

  }
}

class Add {
  int a, b;

  public void checker (String input) {
     try {
        this.a = Integer.parseInt(input);
     } catch (Exception e) {
        System.out.println("Invalid input");
        this.a = 0; // default value
     }
  }

  public void doubleValue () {
    System.out.println("Double value of a is: " + (a * 2));
  }


}