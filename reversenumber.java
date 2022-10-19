public class FindReverseNumber {

 public static void main(String[] args) {

  int number = 1234;
  int reversedNumber = 0;
  int temp = 0;

  while (number > 0) {
   temp = number % 10;

   reversedNumber = reversedNumber * 10 + temp;
   number = number / 10;
  }
   
  System.out.println("Reversed Number is: " + reversedNumber);
 }
}
