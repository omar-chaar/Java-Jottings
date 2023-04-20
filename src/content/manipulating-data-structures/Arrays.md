title=Arrays
type=post
status=published
group=manipulating-data
~~~~~~

The Arrays class contains various methods for manipulating arrays (such as sorting and searching). This class also contains a static factory that allows arrays to be viewed as lists.

The methods in this class all throw a `NullPointerException`, if the specified array reference is null, except where noted.

## Methods

`java.util.Arrays` is a utility class in Java that provides various methods for working with arrays. Some of the commonly used methods of `java.util.Arrays` are:

1.  `sort()`: Sorts the specified array into ascending order. This method uses a variant of the QuickSort algorithm.
2.  `binarySearch()`: Searches the specified array for the specified value using the binary search algorithm. The array must be sorted in ascending order prior to making this call.    
3.  `toString()`: Returns a string representation of the contents of the specified array.    
4.  `fill()`: Assigns the specified value to each element of the specified array.
5.  `copyOf()`: Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.
6.  `asList()`: Returns a fixed-size list backed by the specified array.

Using these methods provided by `java.util.Arrays`, it becomes easier and more efficient to work with arrays in Java. The `sort()` and `binarySearch()` methods, in particular, can be very useful when working with large arrays that need to be sorted or searched.

Some more detailed methods provided by `java.util.Arrays`:

### 1. `equals()`

The `equals()` method in `java.util.Arrays` is used to compare two arrays for equality. The method takes two arrays as arguments and returns `true` if the arrays contain the same elements in the same order.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};

boolean isEqual = Arrays.equals(arr1, arr2); // returns true
```

### 2. `fill()`

The `fill()` method in `java.util.Arrays` is used to fill an array with a specified value. The method takes an array and a value as arguments and sets each element in the array to the specified value.

```java
int[] arr = new int[5];
Arrays.fill(arr, 10); // sets each element in the array to 10
```

### 3. `sort()`

The `sort()` method in `java.util.Arrays` is used to sort an array in ascending order. The method takes an array as an argument and uses the natural ordering of the elements to sort the array.

```java
int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
Arrays.sort(arr); // sorts the array in ascending order
```

### 4. `binarySearch()`

The `binarySearch()` method in `java.util.Arrays` is used to search for a specified element in a sorted array. The method takes an array and a key value as arguments and returns the index of the key value in the array.

```java
int[] arr = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr, 3); // returns 2
```

### 5. `copyOf()`

The `copyOf()` method in `java.util.Arrays` is used to create a copy of an array with a specified length. The method takes an array and a length as arguments and returns a new array with the specified length.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = Arrays.copyOf(arr1, 5); // returns {1, 2, 3, 0, 0}
```