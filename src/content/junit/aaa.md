title=Arrange, Act and Assert
type=post
status=published
group=unit-testing
~~~~~~

## Arrange

To do anything in a test, we first need to arrange the elements of the code that set up the state in a test. In our example, we create a `ScoreCollection` instance and then call the `add()` method with `Scoreable` implementations.

We can create a new `Scoreable` object by using a lambda expression that returns the same value that we want the `Scoreable` instance to return, like `() -> 5`.

## Act

After we have arranged the test, we have to execute the `arithmeticMean()` method code we're trying to verify.

## Assert

Finally, we must assert that we got the expected result. We use the `assertThat()` method, which takes two arguments: the actual result and a matcher. The `equalTo` matcher compares the actual result to the expected value of 6. JUnit passes the test if the matcher returns true; otherwise, it fails the test.

To use the `equalTo` matcher, make sure to use a static import for `org.hamcrest.CoreMatchers.*`.

## Code Sample
```java
//We are testing ScoreCollection.java from "what is JUnit?"  

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
