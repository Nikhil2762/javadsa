import java.util.Scanner;
public class PrintAllTheDivisors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for(int i = 1;i < Math.sqrt(number) ;i++){
      if(number%i == 0){
        System.out.printf("%d %d\n",i,(number/i));
      }
    }
    scanner.close();
  }
}
