public class ReverseArray {
  public static void recursion(int[] arr, int left, int right){
    if(left >= right){
      return;
    }
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    recursion(arr, left + 1, right - 1);
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    recursion(arr, 0, arr.length - 1);
    for(int num : arr){
      System.out.print(num + " ");
    }
  }
}
