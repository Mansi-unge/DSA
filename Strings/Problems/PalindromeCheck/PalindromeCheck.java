package Problems.PalindromeCheck;
import java.util.Scanner;

public class PalindromeCheck {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the String you want to check the palindrome sequence for ");
    String Word = scan.nextLine();
    System.out.println("----String that you entered to  check if it is palindrome or not is :" + Word);



    int left = 0 ;
    int right = Word.length() - 1;
    boolean isPalindrome = true ;
    
    while (left < right) {
      if (Word.charAt(left) != Word.charAt(right)) {
        isPalindrome = false ;
        break;
      }
      left ++ ;
      right --;
    }

    if (isPalindrome) {
      System.out.println("The string is a palindrome.");
    }else{
      System.out.println("The string is NOT a palindrome.");
    }

    scan.close();
  }
}
