public class ArmStrongNumber {
  public static boolean isArmStrongOrNot(int number,int digits){
    int totalsum = 0;
    int comaprenum = number;
    while(number > 0 ){
      int digit = number % 10 ;
      totalsum += Math.pow(digit, digits);
      number = number / 10;
    }
    return totalsum == comaprenum;
  }
  public static void main(String[] args) {
    int number  = 153;
    System.out.println(isArmStrongOrNot(number,3 ));
    number = 100;
    System.out.println(isArmStrongOrNot(number,3 ));
  }
}
