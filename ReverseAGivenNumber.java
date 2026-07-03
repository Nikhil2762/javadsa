import java.util.Scanner;
public class ReverseAGivenNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String number = scanner.nextLine();
    try {
      int _ = Integer.parseInt(number);
      String reversedNumber = new StringBuilder(number).reverse().toString();
      System.out.println(reversedNumber);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
    }
    scanner.close();
  }
}
