import java.util.Scanner;

public class AnagramCheck {
  public static void main(String[] args) {
    System.out.println("Lets check that the given strings are Anagram or not : ");

    Scanner scan = new Scanner(System.in);
    System.out.println("enter the strings to check the anagram or not : "); 
    String wordOne = scan.nextLine();
    String wordTwo = scan.nextLine();

    System.out.println("Words to check that they are anagram or not are : " + wordOne + " and " + wordTwo );

    // boolean anagram = wordOne.length() == wordTwo.length() ;

    if (wordOne.length() != wordTwo.length()) {
      System.out.println("This given strings are not Anagrams ");
      return ;
    }

    int[] countarr = new int[26] ;


    for(int i = 0 ; i < wordOne.length() ; i++){
      char arr = wordOne.charAt(i);
      countarr[arr - 'a']++ ;
    }

    for(int j = 0 ; j < wordTwo.length() ; j++){
      char arr = wordTwo.charAt(j);
      countarr[arr - 'a']--;
        if (countarr[arr - 'a'] < 0 ) {
      System.out.println("The given strings are NOT Anagrams.");
        return; 
    }
    }

     System.out.println("The given strings ARE Anagrams.");
  }
}
