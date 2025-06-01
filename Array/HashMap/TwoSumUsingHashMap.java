import java.util.HashMap;


public class TwoSumUsingHashMap {
  public static void main(String[] args) {
    int[] arr ={2, 7, 11, 15};
    int target = 17;

    HashMap<Integer , Integer>HashMap = new HashMap<>();

    for(int i = 0 ; i < arr.length ; i++){
      int remaining = target - arr[i];
      if (HashMap.containsKey(remaining)) {
      System.out.println("Found Numbers : " + arr[i] + " and " + remaining);  
      }
      HashMap.put(arr[i], i);
    }

  }
}
