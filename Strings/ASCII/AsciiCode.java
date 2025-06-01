import java.util.Scanner;
public class AsciiCode {
  public static void main(String[] args) {
    char code = 'C' ;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your charachter to unlock");
    char userInput = sc.next().charAt(0);

    if ((int)userInput ==  (int)code) {
      System.out.println("System has been unlocked ");
    }
    else{
      System.out.println("Access Denied ");
    }

    System.out.println("your user input is " + (int)userInput);
    System.out.println("secret code ASCII " + (int)code);
  }
}
