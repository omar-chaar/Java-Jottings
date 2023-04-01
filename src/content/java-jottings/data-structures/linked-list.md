title=Linked List
type=post
status=published
group=data-structures
~~~~~~

- Linked list is a dynamic data structure in which the elements are not stored at contiguous memory locations.
- In a linked list, each node contains a data element and a reference (link) to the next node in the sequence.
- A linked list can be singly-linked (each node only has a reference to the next node) or doubly-linked (each node has a reference to both the next and previous nodes).
- Unlike arrays, linked lists do not have a fixed size and can grow and shrink on demand.
- Insertion and deletion of elements at the beginning or end of a linked list are efficient operations with O(1) time complexity.
- However, accessing an element at a specific index in a linked list requires traversing the list from the beginning until the desired index is reached, resulting in a time complexity of O(n).
- Java provides a built-in implementation of linked lists through the LinkedList class in the java.util package.
- The LinkedList class provides methods for adding, removing, and accessing elements in the list, as well as methods for iterating over the elements in the list.
- However, the LinkedList class is not thread-safe, and concurrent modifications to the list can lead to undefined behavior.
- If thread safety is required, the java.util.concurrent package provides a thread-safe implementation of linked lists through the ConcurrentLinkedDeque class.

```java
public class LinkedListNode {
    int val;
    LinkedListNode next;
    
    public LinkedListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int val) {
        LinkedListNode node = new LinkedListNode(val);
        if (head == null) {
            head = node;
        } else {
            LinkedListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void printList() {
        LinkedListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

// Example usage:
LinkedList list = new LinkedList();
list.add(1);
list.add(2);
list.add(3);
list.printList(); // Output: 1 2 3

```