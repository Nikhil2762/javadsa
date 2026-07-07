package module2;

public class InsertionSort {
  public static void insertionSort(int [] arr){
    for(int i = 0;i< arr.length - 1;i++){
      int current = arr[i];
      int j = i -1;
      while(j >= 0 && arr[j] > current){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    for(int value : arr){
      System.out.print(value+" ");
    }
  }
  
  public static void main(String[] args) {
    int [] arr = {10,5,2,40};
    insertionSort(arr);
  }
}
