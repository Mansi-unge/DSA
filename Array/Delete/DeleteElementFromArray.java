public class DeleteElementFromArray {
  public static void main(String[] args) {
    int[] arr =  {10, 20, 30, 40};
    int index = 2;

    int[] newArr = new int[arr.length - 1];

    for(int i = 0, j = 0; i < arr.length; i++) {
      // if (i != index) {
      //   newArr[j++] = arr[i];
      // }
      if (i == index) {     

      } else {
         newArr[j++] = arr[i];  
      }
    }

    System.out.println("Array after deleting element from index 2 is:");
    for(int i = 0; i < newArr.length; i++) {
      System.out.println(newArr[i]);
    }
  }
}
