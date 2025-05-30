public class Inserting {
  public static void main(String[] args){
    int[] arr = { 5, 10, 15, 20};
    int index = 2 ;
    int value = 25 ;

    int[] newarr = new int[arr.length +1 ];

    for(int i=0 , j=0 ; i < newarr.length ; i++ ){
      if (i == index) {
        newarr[i] = value ;
      } else {
        newarr[i] = arr[j++];
      }
    }
    System.out.println("new array is : ");
    for(int i = 0 ; i < newarr.length ; i ++){
      System.out.println(newarr[i]);
    }
  }
}
