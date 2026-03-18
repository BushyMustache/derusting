import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> stringSet = new HashSet<String>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    stringSet.add("apple");
    stringSet.add("orange");
    stringSet.add("banana");

    // Check whether the Set contains a given String
    System.out.println(stringSet.contains("apple"));

    // Remove an element from the Set
    stringSet.remove("orange");

    // Get the size of the Set
    int size = stringSet.size();
    System.out.println("The size of this Set is " + size);

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String fruit : stringSet) {
      System.out.println(fruit);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
