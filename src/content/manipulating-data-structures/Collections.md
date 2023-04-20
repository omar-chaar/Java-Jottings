title=Collections
type=post
status=published
group=manipulating-data
~~~~~~

The class collections consists exclusively of static methods that operate on or return collections. It contains polymorphic algorithms that operate on collections, "wrappers", which return a new collection backed by a specified collection, and a few other odds and ends.

The methods of this class all throw a NullPointerException if the collections or class objects provided to them are null.

## Sorting Methods

-   `sort(List<T> list)`: Sorts the specified list in ascending order using natural ordering of elements.
-   `sort(List<T> list, Comparator<? super T> c)`: Sorts the specified list according to the order induced by the specified comparator.
-   `reverse(List<?> list)`: Reverses the order of the elements in the specified list.
-   `shuffle(List<?> list)`: Randomly permutes the specified list.

## Searching Methods

-   `binarySearch(List<? extends Comparable<? super T>> list, T key)`: Searches the specified list for the specified object using the binary search algorithm.
-   `binarySearch(List<? extends T> list, T key, Comparator<? super T> c)`: Searches the specified list for the specified object using the binary search algorithm.

## Synchronization Methods

-   `synchronizedCollection(Collection<T> c)`: Returns a synchronized (thread-safe) collection backed by the specified collection.
-   `synchronizedList(List<T> list)`: Returns a synchronized (thread-safe) list backed by the specified list.
-   `synchronizedMap(Map<K,V> m)`: Returns a synchronized (thread-safe) map backed by the specified map.
-   `synchronizedSet(Set<T> s)`: Returns a synchronized (thread-safe) set backed by the specified set.

## Miscellaneous Methods

-   `copy(List<? super T> dest, List<? extends T> src)`: Copies all of the elements from one list into another.
-   `fill(List<? super T> list, T obj)`: Replaces all of the elements of the specified list with the specified element.
-   `frequency(Collection<?> c, Object o)`: Returns the number of elements in the specified collection equal to the specified object.
-   `max(Collection<? extends T> coll)`: Returns the maximum element of the given collection, according to the natural ordering of its elements.
-   `min(Collection<? extends T> coll)`: Returns the minimum element of the given collection, according to the natural ordering of its elements.
-   `replaceAll(List<T> list, T oldVal, T newVal)`: Replaces all occurrences of one specified value in a list with another specified value.