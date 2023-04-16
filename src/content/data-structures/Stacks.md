title=Stacks
type=post
status=published
group=data-structures
~~~~~~

A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. In other words, the last element added to the stack will be the first one to be removed.

In Java, the `java.util.Stack` class is available to implement the stack data structure. It extends the `Vector` class and provides all the stack operations such as `push`, `pop`, `peek`, `search`, etc.

## Creating a Stack in Java

To create a stack in Java, you can simply create an instance of the `java.util.Stack` class as follows:

```java
Stack<Integer> stack = new Stack<>();
```

Here, we have created a stack of integers using the generic `Stack` class. You can replace `Integer` with any other object type.

## Stack Operations

The following are the main stack operations that can be performed using the `java.util.Stack` class:

### Push

The `push` operation adds an element to the top of the stack. It can be done using the `push` method as follows:

```java
stack.push(10);
```

### Pop

The `pop` operation removes and returns the top element of the stack. It can be done using the `pop` method as follows:

```java
int topElement = stack.pop();
```

### Peek

The `peek` operation returns the top element of the stack without removing it. It can be done using the `peek` method as follows:

```java
int topElement = stack.peek();
```

### Search

The `search` operation searches for an element in the stack and returns its position. The position is calculated as the distance from the top of the stack. If the element is not present in the stack, it returns `-1`. It can be done using the `search` method as follows:

```java
int position = stack.search(10);
```

In conclusion, a stack is a useful data structure that can be easily implemented in Java using the `java.util.Stack` class. It provides all the necessary stack operations such as `push`, `pop`, `peek`, and `search`.
