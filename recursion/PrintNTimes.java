public class PrintNTimes {
  public static void recursion(String name,int number){
    if(number == 0){
      return;
    }
    System.out.println(name);
    number -= 1;
    recursion(name, number);
  }
 public static void main(String[] args) {
    String name = "To Print Name";
    recursion(name, 10);
  } 
}
