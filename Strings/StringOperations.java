public class StringOperations {
public static void main(String[] args) {
  String name = "Mansi" ;
  String surname = "Unge" ;

  //length of string 
  System.out.println("length of my name is : " + name.length());

  //character access
  System.out.println("character at index 2 in my name mansi is : "+ name.charAt(2));

  //Substring 
  System.out.println("substring of my name from index 0 to 2 is : " + name.substring(0, 2));


  char[] Myname = name.toCharArray();

    System.out.print("conversion of my name from a string datatype to the char array is : " );
  for(int i =0 ; i < Myname.length ; i++){
    System.out.print( Myname[i]);
  }

  //Equality check 
  System.out.println("cheking equality of the both the strings name and surname : " + name.equals(surname));

  //comparing 
  System.out.println("comparing both the strings name and surname : " + name.compareTo(surname));

  //concatenation method 1 
  System.out.println("my full name derived from string concatenation by first method is : " + name + surname);

  //concatenation method 2 
  System.out.println( "my full name derived from string concatenation by second method is : " + name.concat(surname));

}  
}
