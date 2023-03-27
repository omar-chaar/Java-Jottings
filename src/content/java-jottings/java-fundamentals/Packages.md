title=Packages
type=post
status=published
group=java-fundamentals
~~~~~~

**java package** is a group of similar types of classes, interfaces and sub-packages.

## Syntax

Creating a package
```java
package com.example.myapp;
```

Compiling a package
```sh
javac -d directory javafilename
```

Importing a package
```java
package thisPackage;
import com.example.myapp;

public Class{
```

If you import a package, all the classes and interface of that package will be imported excluding the classes and interfaces of the subpackages. Hence, you need to import the subpackage as well.

### Default Package

If you do not specify a package for your classes, they will be placed in the default package. However, it is recommended to always use packages to avoid naming conflicts and make your code easier to manage.

### Package Naming Conventions

Package names in Java follow the reverse domain name convention. For example, if a company owns the domain name example.com, they would use the following package name:

```java
package com.example.myapp;
```

## Package-level Annotations

Java also allows you to add annotations at the package level. These annotations apply to all classes and interfaces in the package. For example:

```java
@Deprecated 
package com.example.myapp;
```

This marks the entire package as deprecated, and any usage of classes or interfaces within the package will generate a warning.