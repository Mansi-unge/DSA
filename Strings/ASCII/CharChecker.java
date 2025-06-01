import java.util.Scanner;

public class CharChecker {
  public static void main(String[] args) {
    System.out.println("Lets Check the character if it is a digit or letter");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any character you want : ");
    char Input = scan.next().charAt(0) ;
    System.out.println("Charachter entered by you is : " + Input );

    if ((int)Input >= 48 && (int)Input <= 57) {
      System.out.println("The charachter entered by you is digit");
      
    } else if ((int)Input >= 65  && (int)Input <= 90) {
       System.out.println("The charachter entered by you is letter with upper case ");
    }else if ((int)Input >= 97  && (int)Input <= 122) {
       System.out.println("The charachter entered by you is letter with lower case ");
    }else{
      System.out.println("The charachter entered by you is symbol");
    }
    
  }
}
