# How to Build the Class

### 1. Use maven to compile
```
mvn compile
```

### 2. Test
```
mvn test
```

### 3. Package into jar
```
mvn package
```

Here, we can do three steps together and clean the package before other steps
```
mvn clean compile test package
```

Afterward, there is a jar on ./target/CodeDojos-Diamond-Kata-1.0-SNAPSHOT.jar

### 4. Run the program
Use java -jar to run the jar file
```
java -jar ./target/CodeDojos-Diamond-Kata-1.0-SNAPSHOT.jar
```
Then the program will ask the character it need.
Also, we can put the character as arg after the main command, e.g. put 'Q'
```
java -jar ./target/CodeDojos-Diamond-Kata-1.0-SNAPSHOT.jar Q
```
Then the program will skip the asking and then print the result directly.