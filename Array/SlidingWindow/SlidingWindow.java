public class SlidingWindow{
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int sum = 0 ;
    int max = 0 ;
    int k = 3 ; 

    for(int i =0 ; i <k ; i++){
      sum += arr[i] ;
    }
    max = sum ;

    //sliding the window 
    for(int i = k ; i < arr.length ; i++){
      sum += arr[i] - arr[i -k ];
      max = Math.max(max,sum);
    }
    System.out.println("Maximum sum of subarray of size " + k + " is : " + max);
  }
}