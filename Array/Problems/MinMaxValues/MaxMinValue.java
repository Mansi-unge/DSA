public class MaxMinValue {
public static void main(String[] args) {
  System.out.println("Lets Find the Maximum and Minimum values : ");

  int[] arr = {10, 20, 30, 40, 50};
  int max = arr[0];
  int min = arr[0];

  for(int i = 0 ; i < arr.length ; i++){
    System.out.println(arr[i]);
    if (arr[i]> max) {
      max = arr[i];
    }
    if (arr[i]< min) {
      min = arr[i];
    }
  }

  System.out.println("min value is : " + min);
  System.out.println("max value is : " + max );

}
}
