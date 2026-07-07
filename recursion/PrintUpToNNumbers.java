public class PrintUpToNNumbers {
  public static void recursion(int number,int i){
    if(i > number){
      return;
    }
    System.out.println(i);
    i += 1;
    recursion(number,i);
  }
  public static void main(String[] args) {
    recursion(10, 1);
  }
}
