public class BruteForceApproach {
  public static void main(String[] args) {
    int[] arr = {3 , -4, 5, 4, -1, 7,-8 };

    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int currSum = 0;
      for (int j = i; j < arr.length; j++) {
        currSum += arr[j];
        // Use Math.max instead of max
        maxSum = Math.max(currSum, maxSum);
      }
    }

    System.out.println("Max sum of subarray is: " + maxSum);
  }
}
