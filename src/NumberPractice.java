public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negative = -1.5f;
    System.out.println(negative + " is a float");
  
    // Create an int with a positive value and assign it to a variable
    int positive = 7;
    System.out.println(positive + " is a int");

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = positive % 3;
    System.out.println("The remainder of " + positive + " divided by 3 is " + remainder);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (positive % 2 == 0) {
      System.out.println(positive + " is even");
    } else {
      System.out.println(positive + " is odd");
    }

    int[] nums = new int[2];
    nums[0] = 54;
    nums[1] = 69;
    for (int num : nums) {
      if (num % 2 == 0) {
        System.out.println(num + " is even");
      } else {
        System.out.println(num + " is odd");
      }
    }

    // Divide the number by another number using integer division
    int quotient = positive / 3;
    System.out.println(positive + " divided by 3 should equal " + quotient + " in Java");

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
