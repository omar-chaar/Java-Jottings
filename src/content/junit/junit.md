title=JUnit
type=post
status=published
group=unit-testing
~~~~~~

JUnit is a unit testing framework for the Java programming language that has been instrumental in the evolution of test-driven development (TDD). In this guide, we will cover the basics of writing JUnit tests and understanding its various parts.

## Understanding the JUnit Test Bits

When writing JUnit tests, there are a few important things to keep in mind:

-   The `@Test` annotation from `org.junit.Assert` is used to mark a method as a test, and JUnit knows to execute it as such. Other methods in the test class that are not marked with this annotation will not be executed.
-   The `fail()` static method comes from the same `org.junit.Assert` class and is used to intentionally fail a test. This can be helpful in cases where we want to make sure a certain condition is not met.
-   Test classes are usually named by appending "Test" to the name of the class being tested. For example, if we are testing a class named `ScoreCollection`, we might name our test class `ScoreCollectionTest`.

## Ready-to-Run Template Test

Here is a ready-to-run template test that you can use as a starting point for your own tests. 

```java
public class ScoreCollectionTest {
    
    @Test
    public void test() {
        fail("Not yet implemented");
    }
    
}
```

As you can see, this test intentionally fails with the message "Not yet implemented". This can be a useful starting point for writing your own tests.

### Important Design Feature

Before we dive into our test, it's important to understand two critical design features of JUnit:

1.  When JUnit calls a test method, it executes statements from top to bottom.
2.  If JUnit runs through to the end of the test method without encountering an explicit `fail()` or an assertion that fails, the test passes.

## A Passing test

```java
//Scoreable.java
package testingpackage;  

@FunctionalInterface
public interface Scoreable {
   int getScore();
}
```

```java 
//ScoreCollection.java
package testingpackage;
import java.util.*;

public class ScoreCollection {
   private List<Scoreable> scores = new ArrayList<>();
   public void add(Scoreable scoreable) {
      scores.add(scoreable);
   }

   public int arithmeticMean() {
      int total = scores.stream().mapToInt(Scoreable::getScore).sum();
      return total / scores.size();
   }
}
```

As you can see, `ScoreCollection` accepts a `Scoreable` instance through its `add()` method. A `Scoreable` object is simply one that can return an `int` score value.

```java 
//ScoreCollectionTest.java
package testingpackage;
import static org.junit.Assert.*;
import org.junit.*;

public class ScoreCollectionTest {
    @Test
    public void test() {
    }
}
```

The way that JUnit works is that the code above will be always a Passing Test since there is no call of the `fail()` method.

## Arrange, Act, and Assert Your Way to a Test

```java
//We are testing ScoreCollection.java from above  

package testingpackage;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

  

public class ScoreCollectionTest {

   @Test
   public void answersArithmeticMeanOfTwoNumbers() {
      // Arrange
      ScoreCollection collection = new ScoreCollection();
      collection.add(() -> 5);
      collection.add(() -> 7);
      
      // Act
      int actualResult = collection.arithmeticMean();
      
      // Assert
      assertThat(actualResult, equalTo(6));

   }

}
```


## Arrange

To do anything in a test, we first need to arrange the elements of the code that set up the state in a test. In our example, we create a `ScoreCollection` instance and then call the `add()` method with `Scoreable` implementations.

We can create a new `Scoreable` object by using a lambda expression that returns the same value that we want the `Scoreable` instance to return, like `() -> 5`.

## Act

After we have arranged the test, we have to execute the `arithmeticMean()` method code we're trying to verify.

## Assert

Finally, we must assert that we got the expected result. We use the `assertThat()` method, which takes two arguments: the actual result and a matcher. The `equalTo` matcher compares the actual result to the expected value of 6. JUnit passes the test if the matcher returns true; otherwise, it fails the test.

To use the `equalTo` matcher, make sure to use a static import for `org.hamcrest.CoreMatchers.*`.

## Test-driven development

Test-driven development is a vital practice that involves writing tests to ensure that the code works as expected. It's crucial to ensure that the tests fail initially to avoid false assumptions. Programmers who follow TDD always demonstrate test failure first, which proves that their code is responsible for making the test pass.