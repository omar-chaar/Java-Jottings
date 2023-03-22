title=Java Basic Syntax
type=post
status=published
~~~~~~

Java programs are organized into Classes, which are defined using the `class` keyword. For example, the following code defines a class named `MyClass`:

```java
public class MyClass { 
// code describing MyClass behaviour and states goes here 
}
```


Each class can have one or more methods, which define the behaviour of the class. Methods are defined using the `public` keyword (which indicates that the method can be accessed from outside the class), followed by the return type of the method, followed by the method name and its parameters. 

```java
public int add(int a, int b) {
    return a + b;
}
```

Java is a strongly-typed language, which means that all variables and expressions have a specific type. Types can be primitive (like `int` or `boolean`) or reference types (like `String` or `Object`). 

```java
int x = 10;
```

Java supports a wide range of control structures, including `if` statements, `for` loops, `while` loops, and `switch` statements.
```java
if (x > y) { 
	System.out.println("x is greater than y"); 
}
```


Java supports Objected-Oriented Programming, which means that classes can inherit behaviour and data from other classes, and can override methods to provide customized behaviour. For example, the following code defines a subclass named `ChildClass` that extends a superclass named `ParentClass`:

```java
class Animal {
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("The dog says woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.speak();
        
        Dog myDog = new Dog();
        myDog.speak();
    }
}
```