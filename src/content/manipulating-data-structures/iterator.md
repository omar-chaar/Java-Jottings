title=Iterator
type=post
status=published
group=manipulating-data
~~~~~~

The `Iterator` interface in Java provides a way to traverse through a collection of objects one by one. It is part of the `java.util` package and is commonly used in conjunction with the Collection framework. The Iterator interface defines three methods:

1.  `boolean hasNext()`: returns true if there are more elements in the collection being iterated over.
2.  `E next()`: returns the next element in the collection being iterated over.
3.  `void remove()`: removes the last element returned by the iterator.

Here is an example of how to use an Iterator to iterate over a List:

```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

```

The `hasNext()` method is called in the `while` loop to check if there are more elements in the List to iterate over. The `next()` method is called to retrieve the next element in the List and assign it to the `element` variable. Finally, the `remove()` method can be called to remove the last element returned by the Iterator.

Iterators can also be used with other types of collections, such as Sets and Maps. In addition to the Iterator interface, Java also provides the `ListIterator` interface, which extends the Iterator interface to allow for bidirectional traversal of Lists.