import java.util.Scanner;
public class GCD {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int r = num1 % num2;
      while(r!=0){
        num1 = num2;
        num2 = r;
        r = num1 % num2;
      }
      System.out.println(num2);
      scanner.close();
    }  
}
