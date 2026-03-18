import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> map = new HashMap<String, Integer>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("John", 123);
    map.put("Michael", 456);
    map.put("Jason", 789);

    // Get the value associated with a given key in the Map
    int JohnID = map.get("John");
    System.out.println("John's ID number is " + JohnID);

    // Find the size (number of key/value pairs) of the Map
    int mapSize = map.size();
    System.out.println("The size of this map is " + mapSize);

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    map.replace("Michael", 654);
    System.out.println("Michael's new ID number is " + map.get("Michael"));

    // Check whether the Map contains a given key
    System.out.println("Is Jason in the system? " + map.containsKey("Jason"));

    // Check whether the Map contains a given value
    System.out.println("Is someone's ID number 123? " + map.containsValue(123));

    // Iterate over the keys of the Map, printing each key
    for (String name : map.keySet()) {
      System.out.print(name + " ");
    }

    System.out.println();

    // Iterate over the values of the map, printing each value
    for (int ID : map.values()) {
      System.out.print(ID + " ");
    }

    System.out.println();

    // Iterate over the entries in the map, printing each key and value
    for (String employee : map.keySet()) {
      System.out.println(employee + " : " + map.get(employee));
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
