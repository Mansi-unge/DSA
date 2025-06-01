public class TwoSum {
  public static void main(String[] args) {
    int[] arr ={2, 7, 11, 15};
    int target = 9 ;

    for(int i = 0 ; i < arr.length ; i++){     
     for (int j = i ; j < arr.length ; j++){
      if (arr[i] + arr[j] == target) {
        System.out.println(" By adding "+ arr[i] + " and " + arr[j] + " gives us the target we want 9 ");
      }
     }
    }
  }
}
