public class SumOfFirstNNumbers {
  public static int recursion(int n){
    if(n == 0){
      return 0;
    }
    return n + recursion(n - 1);
  }
  public static void main(String[] args) {
    int result = recursion(10);
    System.out.println(result);
  }
}
