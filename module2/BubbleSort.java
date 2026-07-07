package module2;

public class BubbleSort {
  public static void bubbleSort(int [] arr){
    for(int i = 0;i< arr.length;i++){
      for(int j = 0;j<arr.length - i - 1;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int value : arr){
      System.out.print(value+" ");
    }
  }
  public static void main(String[] args) {
    int [] arr = {5,3,1,7,1};
    bubbleSort(arr);
  }
}
