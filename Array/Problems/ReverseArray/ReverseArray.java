public class ReverseArray {
  public static void main(String[] args) {
    System.out.println("lets reverse the array elements");

    int[] arr = {10, 20, 30, 40, 50, 60} ;
    int start = 0 ;
    int end = arr.length-1 ;

    while (start < end) {
      int temp = arr[start];
      arr[start]= arr[end];
      arr[end]= temp ;
      start ++ ;
      end -- ;
    }
    for(int i = 0 ; i < arr.length ; i++){
      System.out.println(arr[i]);
    }
  }
}
