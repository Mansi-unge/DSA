import java.util.Arrays;

public class StringReverse {
  public static void main(String[] args) {
    System.out.println("Lets Reverse the string conatining my name Mansi Unge to Unge Mansi ");

    String fullName = " Mansi Unge ";
    System.out.println("name before trim" + fullName);
    String[] Myname = fullName.trim().split("\\s+");
    System.out.println("name after trim and split " + Arrays.toString(Myname));

    // String[] MyFullName = Myname.split("\\s+");
    // System.out.println("name after split" + Arrays.toString(MyFullName));


    StringBuilder MyFullName = new StringBuilder() ;

    for (int i = Myname.length - 1; i >= 0; i--) {
       MyFullName.append(Myname[i]);
       if (i != 0) {
        MyFullName.append(" ");
       }
    }

    System.out.println("My reversed Full name is : " + MyFullName);

  }
}
