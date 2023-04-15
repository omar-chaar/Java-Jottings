title=LinkedList
type=post
status=published
group=data-structures
~~~~~~

A linked list is a data structure that consists of a collection of nodes, where each node contains a value and a reference to the next node in the list. 

Unlike arrays, which have a fixed size, linked lists can dynamically grow or shrink as elements are added or removed. This makes them a flexible data structure for implementing certain types of algorithms, such as graph traversal and dynamic memory allocation.

However, accessing a particular element in a linked list can be slower than with an array, as each element must be traversed in order until the desired element is found. 

## Types of Linked Lists

-   Singly Linked List: Each node contains data and a reference to the next node only.
-   Doubly Linked List: Each node contains data and references to both the previous and the next nodes.
-   Circular Linked List: The last node in the list points to the first node.

## Declaration

To use linked lists in Java, you need to create a class that represents the nodes and another class that represents the list. Here's an example of how to declare a linked list:

```java
class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
class LinkedList {
    Node head;
 
    public LinkedList() {
        this.head = null;
    }
}
```

## Methods

### 1. Adding Elements

-   `void addFirst(int data)` - Adds the specified element to the beginning of the list.
-   `void addLast(int data)` - Adds the specified element to the end of the list.
-   `void addAtIndex(int index, int data)` - Adds the specified element at the specified position in the list.

### 2. Removing Elements

-   `void removeFirst()` - Removes the first element from the list.
-   `void removeLast()` - Removes the last element from the list.
-   `void removeAtIndex(int index)` - Removes the element at the specified position in the list.

### 3. Retrieving Elements

-   `int getFirst()` - Returns the first element in the list.
-   `int getLast()` - Returns the last element in the list.
-   `int getAtIndex(int index)` - Returns the element at the specified position in the list.

### 4. Other Methods

-   `boolean isEmpty()` - Returns `true` if the list is empty, otherwise `false`.
-   `int size()` - Returns the number of elements in the list.
-   `void printList()` - Prints the elements in the list.

## Best Practices

-   Always initialize the head to null.
-   Use the addFirst() method for stack-like behavior.
-   Use the addLast() method for queue-like behavior.
-   Avoid using the get() method as it requires iterating over the entire list.
-   Always check if the list is empty before calling the remove() method.