package module2;

public class SelectionSort {

  public static void selectionSort(int [] arr){
    for(int i = 0;i< arr.length - 1;i++){
      int minIndex = i;
      for(int j = i + 1 ;j < arr.length ;j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] =  arr[i];
      arr[i] = temp;
    }
    for(int value : arr){
      System.out.print(value+" ");
    }
  }
  public static void main(String[] args) {
    int [] arr = {10,5,2,40};
    selectionSort(arr);
  }
}
