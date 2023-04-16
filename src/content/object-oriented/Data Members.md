title=Data Members
type=post
status=published
group=object-oriented
~~~~~~

In Java, a data member is a variable that is associated with a class or an object. It can be a primitive data type, an object, or an array.

## Types of Data Members

### 1. Instance Variables

Instance variables are declared within a class but outside of any method. They are created when an object is instantiated and can be accessed using the object reference.

```java
public class MyClass {
   int myInstanceVar; // instance variable
   
   public static void main(String[] args) {
      MyClass obj1 = new MyClass();
      MyClass obj2 = new MyClass();

      obj1.myInstanceVar = 10;
      obj2.myInstanceVar = 20;

      System.out.println(obj1.myInstanceVar); // output: 10
      System.out.println(obj2.myInstanceVar); // output: 20
   }
}
```

### 2. Class Variables

Class variables, also known as static variables, are declared with the `static` keyword. They belong to the class rather than any instance of the class.

```java
public class MyClass {
   static int myClassVar; // class variable
   
   public static void main(String[] args) {
      MyClass.myClassVar = 10;
      System.out.println(MyClass.myClassVar); // output: 10
   }
}
```

### 3. Local Variables

Local variables are declared within a method or a block of code. They have a limited scope and are only accessible within that block.

```java 
public class MyClass {
   public static void main(String[] args) {
      int myLocalVar = 10; // local variable
      System.out.println(myLocalVar); // output: 10
   }
}
```

### 4. Parameters

Parameters are variables that are passed into a method when it is called.

```java
public class MyClass {
   public static void main(String[] args) {
      int result = addNumbers(10, 20);
      System.out.println(result); // output: 30
   }

   public static int addNumbers(int a, int b) { // parameters
      return a + b;
   }
}
```

## Access Modifiers

In Java, access modifiers can be used to specify the visibility of data members. There are four access modifiers:

-   `private`: Data members are only accessible within the same class.
-   `default` (no keyword): Data members are accessible within the same package.
-   `protected`: Data members are accessible within the same package and by subclasses outside of the package.
-   `public`: Data members are accessible from anywhere.

```java
public class MyClass {
   private int myPrivateVar; // private data member
   int myDefaultVar; // default data member
   protected int myProtectedVar; // protected data member
   public int myPublicVar; // public data member
}
```

## Best Practices

-   Use access modifiers to restrict access to data members as much as possible.
-   Use instance variables to store object-specific data, and use class variables to store data that is shared among all objects of a class.
-   Avoid using public data members, as they can be easily modified from outside the class, which can lead to unexpected behaviour. Instead, use getter and setter methods to access and modify the data.