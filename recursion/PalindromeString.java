public class PalindromeString {
  public static boolean recursion(String str, int left, int right){
    if(left >= right){
      return true;
    }
    if(str.charAt(left) != str.charAt(right)){
      return false;
    }
    return recursion(str, left + 1, right - 1);
  }
  public static void main(String[] args) {
    String str = "madam";
    boolean result = recursion(str, 0, str.length() - 1);
    System.out.println(result);
  }
}
