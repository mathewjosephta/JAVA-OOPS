/* Let’s say we have a requirement where we need to only register the students when 
   their age is less than 12 and weight is less than 40, if any of the condition is 
   not met then the user should get an ArithmeticException with the warning message 
   “Student is not eligible for registration”. */

public class ThrowExample {
  static void checkEligible(int stdage, int stdweight) {
    if (stdage < 12 && stdweight < 40) {
      throw new ArithmeticException("Student is not eligible for registration");
    } else {
      System.out.println("Student Entry is valid!!");
    }
  }

  public static void main(String args[]) {
    System.out.println("Welcome to the registration process!!");
    checkEligible(10, 39);
    System.out.println("Have a nice day....");
  }
}
