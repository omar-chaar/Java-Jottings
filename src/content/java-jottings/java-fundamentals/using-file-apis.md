title=Using File APIs
type=post
status=published
group=java-fundamentals
~~~~~~

## Sample Code

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List; 

public class App {
    public static void main(String[] args) throws Exception {
        //Writing files 
		String text = "This is a test";
        try{
            Files.write(Paths.get("file.txt"), text.getBytes(), StandardOpenOption.CREATE);
            System.out.println("File wrote successfully");
        } catch (IOException exception){
            System.out.println("it wasn't possible to write the file");
        }
        
        //Reading files
        try{
            List<String> textRead = Files.readAllLines(Paths.get("file.txt"));
            for(String line: textRead)
                System.out.println(line);
		} catch (IOException exception){
            System.out.println("it wasn't possible to read the file");
        } 
        //Manipulating Paths
        Path path = Paths.get(".","file.txt");
        
        //Deleting
        try{
	        Files.delete(path);
        }catch (IOException exception){
            System.out.println("it wasn't possible to delete the file");
        }     
	}
}
```

### `java.io.File` vs `java.nio.file.Path`
Java has two file APIs.
- The original `java.io.File` API, available since Java 1.0 (1996).  
- The newer `java.nio.file.Path` API, available since Java 1.7 (2011).

## File vs Path API

Nevertheless, `java.nio.file.Path` does everything `java.io.File` can, but generally in a better way and more. A few examples:
- File Features: The new classes support symlinks, proper file attributes and metadata support (think: PosixFileAttributes), ACLs and more.
- Better usage: E.g. when deleting a file, you get an exception with a meaningful error message (no such file, file locked, etc.), instead of a simple boolean saying `false`.
- Decoupling: Enabling support for in-memory file systems, which we’ll cover later.

### Reading Files

To read the contents of a file in Java, you can use the `java.nio.file.Files` class, which provides a number of static methods for working with files. The most common method for reading a file is `readAllLines`, which reads all the lines in a file and returns them as a list of strings:

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileExample {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("folder\\file.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
```

### Writing Files

To write to a file in Java, you can use the `java.nio.file.Files` class again, this time with the `write` method:

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFileExample {
    public static void main(String[] args) throws Exception {
        String text = "Hello, world!";
        Files.write(Paths.get("folder\\file.txt"), text.getBytes(), StandardOpenOption.CREATE);
    }
}
```

### Deleting Files and Directories

To delete a file in Java, you can use the `java.nio.file.Files` class with the `delete` method:

```java
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileExample {
    public static void main(String[] args) throws Exception {
        Files.delete(Paths.get("folder\\file.txt"));
    }
}
```

To delete a directory, you can use the `java.nio.file.Files` class again, this time with the `delete` method and a directory path:

```java
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteDirectoryExample {
    public static void main(String[] args) throws Exception {
        Files.delete(Paths.get("folder"));
    }
}
```

### Manipulating Paths

When working with files and directories, you often need to manipulate paths. Java provides the `java.nio.file.Path` interface for working with paths. You can create a path using the `Paths.get` method:

```java
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("directory", "file.txt");
        System.out.println(path.toString());
    }
}
```

### Best Practices

When working with files in Java, it is important to properly handle exceptions and close files when you are done with them. It is also a good practice to use try-with-resources statements to automatically close files, and to use appropriate file permissions to ensure the security of your files.

