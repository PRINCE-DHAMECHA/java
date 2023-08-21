package aa_getting_started;

public class A_First {
    public static void main(String[] args) {
        System.out.println("Hello, Mom!");
    }
}

/* Note: For Java to recognize this as a public class (and not throw a compile time error), the filename must be the same as the class name (A_First in this example) with a .java extension. There should also be a public access modifier before it. */

/* Naming conventions recommend that Java classes begin with an uppercase character, and be in camel case format (in which the first letter of each word is capitalized). The conventions recommend against underscores (_) and dollar signs ($). */

// To compile, open a terminal window and navigate to the directory of A_First.java:
// cd /path/to/containing/folder/

// Enter javac followed by the file name and extension as follows:
// $ javac A_First.java
// Note: The javac command invokes the Java compiler.

// The compiler will then generate a bytecode file called A_First.class which can be executed in the Java Virtual Machine (JVM). The Java programming language compiler, javac, reads source files written in the Java programming language and compiles them into bytecode class files. Optionally, the compiler can also process annotations found in source and class files using the Pluggable Annotation Processing API. The compiler is a command line tool but can also be invoked using the Java Compiler API.

// To run your program, enter java followed by the name of the class which contains the main method (A_First in our example). Note how the .class is omitted:
// java A_First

// You will need to use a compiler (javac) and an executor (java) provided by your JVM. To find out which versions you have installed, enter java -version and javac -version on the command line. The version number of your program will be printed in the terminal (e.g. 1.8.0_73).





