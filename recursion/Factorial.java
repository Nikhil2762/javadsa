public class Factorial {
  
  public static int factorialRecursion(int n ){
    if(n == 0 || n == 1){
      return 1;
    }
    return n*factorialRecursion(n - 1);
  }
  public static void main(String[] args) {
    int result = factorialRecursion(5) ;
    System.out.println(result);
  }
}
