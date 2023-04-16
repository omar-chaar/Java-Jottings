title=Methods
type=post
status=published
group=object-oriented
~~~~~~

Methods in Java are blocks of code that perform a specific task. They are used to achieve encapsulation, modularity, and reusability of code.

## Method Declaration

A method declaration consists of a method signature, followed by the method body.

```java
accessModifier returnType methodName(parameterList) {
    // method body
}
```

-   **Access Modifier**: determines the visibility of the method. Can be public, private, or protected.
-   **Return Type**: specifies the type of value that the method returns, or void if it does not return a value.
-   **Method Name**: specifies the name of the method.
-   **Parameter List**: specifies the type and name of the parameters passed to the method.

## Method Overloading

Java supports method overloading, which allows us to define multiple methods with the same name but with different parameters.

```java
public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
```

## Method Overriding

Method overriding occurs when a subclass provides a specific implementation of a method that is already provided by its parent class.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

## Method Visibility

-   **public**: The method can be accessed from anywhere.
-   **private**: The method can only be accessed within the same class.
-   **protected**: The method can only be accessed within the same class, subclasses, and same package.
-   **default**: The method can only be accessed within the same package.

## Static Methods

Static methods belong to the class and not to any instance of the class. They can be accessed without creating an object of the class.

```java
public class Calculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
```

## Final Methods

Final methods cannot be overridden in subclasses.

```java
public class Animal {
    public final void makeSound() {
        System.out.println("Generic animal sound");
    }
}
```

