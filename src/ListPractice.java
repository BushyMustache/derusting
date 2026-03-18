import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> stringList = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    stringList.add("orange");
    stringList.add("blue");
    stringList.add("green");

    // Print the element at index 1
    System.out.println(stringList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    stringList.set(1, "yellow");
    
    System.out.println();
    System.out.println("The size of the ArrayList is " + stringList.size());

    // Insert a new element at index 0 (the length of the list will change)
    stringList.add(0, "red");
    System.out.println("The size of the ArrayList is " + stringList.size());

    // Check whether the list contains a certain string
    if (stringList.contains("red")) {
      System.out.println("The list contains this String");
    } else {
      System.out.println("The list doesn't contain this String");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < stringList.size(); i++) {
      System.out.println((i + 1) + ". " + stringList.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(stringList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String color : stringList) {
      System.out.println(color);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}