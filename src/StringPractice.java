import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Hello";

    // Find the length of the string
    int wordLength = word.length();

    // Concatenate (add) two strings together and reassign the result
    String result = word + " World!";
    word = result;

    wordLength = word.length();

    System.out.println(word);

    // Find the value of the character at index 3
    char index3 = word.charAt(3);
    System.out.println(index3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(word.contains("ll"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < wordLength; i++) {
      System.out.println(word.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> strings = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    strings.add("hello");
    strings.add("hi");
    strings.add("greetings");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String bigString = String.join(", ", strings);
    System.out.println(bigString);

    // Check whether two strings are equal
    boolean equal = strings.get(0).equals(strings.get(1));
    System.out.println("Does Hello equal Hi? " + equal);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
