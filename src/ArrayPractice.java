public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] array = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    array[0] = "John";
    array[1] = "is";
    array[2] = "really";
    array[3] = "cool";

    // Get the value of the array at index 2
    String value = array[2];
    System.out.println(value);

    // Get the length of the array
    int size = array.length;

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < size; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println();

    // Iterate over the array using a for-each loop and print out each item
    for (String word : array) {
      System.out.print(word + " ");
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */    

  }
}
