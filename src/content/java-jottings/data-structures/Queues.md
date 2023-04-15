title=Queues
type=post
status=published
group=data-structures
~~~~~~


Queues are a data structure that work on the principle of "First-In-First-Out" (FIFO), meaning that the first element added to the queue will be the first one to be removed. New elements are added at one end of the queue, called the "rear", and elements are removed from the other end of the queue, called the "front". 

Queues are useful when you need to manage a collection of elements in a specific order, such as when you want to process tasks in the order they were received. In Java, queues are implemented as interfaces with multiple implementations, such as LinkedList, PriorityQueue, and ArrayDeque.

In Java, queues are implemented using the `java.util.Queue` interface, which provides a set of methods for adding, removing, and inspecting elements in the queue.

## Declaration

To use a queue in Java, you need to import the `java.util.Queue` interface. Here's an example of how to declare a queue:

```java
Queue<Integer> queue = new LinkedList<Integer>();
```

## Methods

### 1. Adding Elements

-   `add(E e)` - Adds the specified element to the back of the queue.
-   `offer(E e)` - Inserts the specified element at the back of the queue.

### 2. Removing Elements

-   `remove()` - Removes and returns the element at the front of the queue.
-   `poll()` - Removes and returns the element at the front of the queue, or returns `null` if the queue is empty.

### 3. Inspecting Elements

-   `element()` - Retrieves, but does not remove, the element at the front of the queue.
-   `peek()` - Retrieves, but does not remove, the element at the front of the queue, or returns `null` if the queue is empty.

### 4. Other Methods

-   `size()` - Returns the number of elements in the queue.
-   `isEmpty()` - Returns `true` if the queue is empty, otherwise `false`.
-   `iterator()` - Returns an iterator over the elements in the queue.

## Best Practices

-   Use the `add()` method for adding elements to the queue, as it can throw an exception if the queue is full.
-   Use the `offer()` method for adding elements to the queue if you want to avoid the exception.
-   Always check if the queue is empty before calling the `remove()` or `element()` methods, as they can throw an exception if the queue is empty.
-   Use the `poll()` and `peek()` methods if you want to avoid the exception and return `null` if the queue is empty.