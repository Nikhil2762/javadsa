import java.util.Scanner;
public class CountDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int sumOfDigits = 0;
    while(number > 0){
      sumOfDigits += 1;
      number = number / 10;
    }
    System.out.println(sumOfDigits);
    scanner.close();
  }
}
