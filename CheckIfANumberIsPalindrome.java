import java.util.Scanner;
public class CheckIfANumberIsPalindrome {
  public static boolean isPalindrome(String number,int length){
    char [] numberArray = number.toCharArray();
    int left = 0;
    int right = length;
    while(left>right){
      if(numberArray[left] == numberArray[right]){
        left += 1;
        right -= 1;
      }else{
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String number = scanner.nextLine();
    try {
      int _ = Integer.parseInt(number);
      boolean result = isPalindrome(number, number.length());
      if(result){
        System.out.println("Yes");
      }else{
        System.out.println("Np");
      }
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
    }
    scanner.close();
  }
}
