title=Maps in Java
type=post
status=published
group=data-structures
~~~~~~

A Map is a collection that stores key-value pairs, where each key is unique.




### Key and Values

Key and Value Types: The key and value types in a Map can be any non-null object. It is important to choose appropriate types for the key and value based on the requirements of the program.

### Adding and Retrieving Elements

You can add and retrieve elements from a Map using the put() and get() methods, respectively. The get method takes a key as an argument and returns the corresponding value.

### Remove

To remove an element from a Map, you can use the remove() method using the key.

### Iterate over
You can iterate over the keys or values in a Map using the keySet() and values() methods, respectively.


### Different types of maps

1. Hash Tables - A hash table based implementation of the Map interface. It allows null values and keys, but does not maintain any order.

2. TreeMap - A Red-Black tree based implementation of the Map interface. It maintains the keys in sorted order and does not allow null keys but allows null values.
3.  LinkedHashMap - A hash table based implementation of the Map interface that maintains insertion order. It allows null values and keys.
    
4.  WeakHashMap - A hash table based implementation of the Map interface that uses weak references to hold its keys. This means that if a key is no longer referenced, it can be garbage collected even if it is still in the map.
    
5.  EnumMap - A specialized implementation of the Map interface for use with enum keys. It is more efficient than other Map implementations for enum keys and does not allow null keys (but allows null values).
    
6.  IdentityHashMap - A hash table based implementation of the Map interface that uses reference equality to compare keys. It allows null keys but does not compare keys using their equals() method.

### Code example

```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap to store key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Retrieve values from the map using keys
        int aliceAge = map.get("Alice");
        int bobAge = map.get("Bob");

        // Print the retrieved values
        System.out.println("Alice is " + aliceAge + " years old.");
        System.out.println("Bob is " + bobAge + " years old.");

        // Remove a key-value pair from the map
        map.remove("Charlie");

        // Iterate over the keys and values in the map
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + " is " + age + " years old.");
        }
    }
}

```