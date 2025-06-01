public class StringImmutability {
public static void main(String[] args) {
  String name = "Mansi" ;
  System.out.println( "my name is " + name);

  String fullName = name.concat("Unge");
  System.out.println("My full name is " + fullName);
}
}