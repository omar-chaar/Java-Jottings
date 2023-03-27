title=Stacks
type=post
status=published
group=data-structures
~~~~~~

There are several advantages of using a stack data structure:

1.  LIFO (Last-In-First-Out) behaviour: The stack data structure allows for easy access to the most recently added element, as the last item to be added is the first to be removed.
2.  Constant time insertion and deletion: Adding or removing an element from a stack takes constant time, regardless of the size of the stack.
3.  Memory management: Stacks are useful for managing memory in programming languages. For example, when a function is called, local variables are added to the stack, and when the function returns, those variables are removed from the stack.
4.  Easy to implement: Stacks can be implemented using arrays or linked lists, which are both relatively easy to implement.

Stacks are particularly useful in situations where you need to keep track of a last-in-first-out sequence of elements. For example, when evaluating expressions, a stack can be used to keep track of operators and operands in the correct order. Stacks are also used in recursive algorithms, as they allow for efficient memory management when recursive calls are made. In addition, stacks can be used in undo/redo functionality in applications, as well as in web browsing history.

## Sample code

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<Integer>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println(stack.pop()); // prints 3
        System.out.println(stack.pop()); // prints 2

        // Check the top element of the stack
        System.out.println(stack.peek()); // prints 1

        // Check if the stack is empty
        System.out.println(stack.empty()); // prints false

        // Search for an element in the stack
        System.out.println(stack.search(1)); // prints 1 (1-based index)

        //Prints Stack, has builtin toString() method
        System.out.println(stack);
    }
}

```