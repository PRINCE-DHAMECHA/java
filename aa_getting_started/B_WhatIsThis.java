package aa_getting_started;

public class B_WhatIsThis {
    public static void main(String[] args) {
        System.out.println("Hello, Mom");
    }
}

// A closer look at the B_WhatIsThis program

// The B_WhatIsThis program contains a single file, which consists of a B_WhatIsThis class definition, a main method, and a statement inside the main method.

// public class B_WhatIsThis

// The class keyword begins the class definition for a class named B_WhatIsThis. Every Java application contains at least one class definition (Further information about classes later).

// public static void main(String[] args) {

// This is an entry point method (defined by its name and signature of public static void main(String[])) from which the JVM can run your program. Every Java program should have one. It is:

// public: meaning that the method can be called from anywhere mean from outside the program as well.

// static: meaning it exists and can be run by itself (at the class level without creating an object).

// void: meaning it returns no value. Note: This is unlike C and C++ where a return code such as int is expected (Java's way is System.exit())

// This main method accepts: An array (typically called args) of Strings passed as arguments to main function (e.g. from command line arguments).

// Note: A single application may have multiple classes containing an entry point (main) method. The entry point of the application is determined by the class name passed as an argument to the java command.

// System.out.println("Hello, Mom!");

// System :-  this denotes that the subsequent expression will call upon the System class, from the java.lang package.

// . :- this is a "dot operator". Dot operators provide you access to a classes members1; i.e. its fields (variables) and its methods. In this case, this dot operator allows you to reference the out static field within the System class.

// out :- this is the name of the static field of PrintStream type within the System class containing the standard output functionality.

// println :- this is the name of a method within the PrintStream class. This method in particular prints the contents of the parameters into the console and inserts a newline after

// ( :- this parenthesis indicates that a method is being accessed (and not a field) and begins the parameters being passed into the println method.

// "Hello, Mom!" :- this is the String literal that is passed as a parameter, into the println method. The double quotation marks on each end delimit the text as a String.

// ) :- this parenthesis signifies the closure of the parameters being passed into the println method.

// ; :- this semicolon marks the end of the statement.
// Note: Each statement in Java must end with a semicolon (;).

// The method body and class body are then closed.
