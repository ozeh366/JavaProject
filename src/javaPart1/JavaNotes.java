package javaPart1;

public class JavaNotes {

    /* Variables;
        Variables are placeholders or container that can hold values.
        You must specify the data type of the variable.

        int x; //  declaration of variable
        x=100; // initialization of variable

       Data Types
       1. Primitive data types
            int, double, char, boolean, short, float etc.
       2. Derived data types
            Array, Arraylist, String, HashMapDemo etc

       Operators
           An operator is a symbol that performs a mathematical operation between two operands.
           Arithmetic Operators --> + - * / %
           Relational Operators (comparison operators) --> == < > <= >= !=
           Logical Operators && II !
           Increment/Decrement Operators ++ --
           Assignment Operators =

       Conditional Statements
           for one condition, use if....else
           if more than one condition use nested if ie else if
           For more than 5 conditions use Switch Case Statement
                switch (expression)
                {
                case <condition1>: statements; break;
                case <condition2>: statements; break;
                case <condition3>: statements; break;
                default: statements;

       Default Statements
           Loop: is a set of statements that can be repeated multiple times based on a condition
           *For While & Do While loop you must;
               initialize the value
               set the condition
               specify either increment or decrement.

       While loop
            while(condition)
            {
            statements;
            }

       Do..WHile loop
           do
           {
           statement
           }while(condition);

       For Loop
            for(initialize the value; condition; inc/dec)
            {
            statement;
            }

       Jumping Statements


       Note: If you know the end point (inc/dec) use For Loop, if not, use while or do while loop.

       Diff btw while and For Loop
          1. While loop requires three diff statements for the initialization, condition and inc/dec aka exit while
           in For loop, all three statements can be written in a single line of code.
          2. Use For loop if you know the maximum limit or exit else use while loop if you don't know the maximum limit.
     */

     /*
        Array

            Array is a collection os elements of same data type.

         Types of Array
         1. Single Dimensional Array
            a. Declare an Array
                int a[] = new int[5]; // int []a=new int[5]
            b. Insert Values into Array
            c. Find size of an array
            d. Read Values from an Array.

         2. Two/Multi Dimensional Array
            a. Declare an Array
                int a[][]=new int[3][2]
                int a[][]=new int[3][2]
            b. Insert Values into Array
            c. Find size of an array
            d. Read Values from an Array.
         */

        /*
        ArrayListDemo
            int a[] = new int a[5];

         Operations on ArrayListDemo
           1. How to declare arraylist
                (see Arraylist Demo file)
         */
        /*
        JDBC - Java Database Connectivity
           Pre-reqs
            1. Download DB Driver (.jar file)
            2. Add driver to your project

            Steps to write JDBC program
            1. Create a connection
            2. Create a query/statement
            3. Execute query
            4. Close connection

         */


        /*
        String
            String is a collection of characters.

            String s="Welcome"

        String Methods
            1. Find the length of characters
                    s.length()
            2. To join two strings
                    s.concat
         */

    /*
    OOP -   Object Oriented Programming Language

        OOP uses class, object and Method.

    Classes: A class is a collection of methods and variables.
     A class is a logical entity eg Animal
     objects are physical entities with similar characteristics eg dog, cat etc
     Objects have attributes (variables) and behaviors (methods)

     Object; is an instance of a class. it can use the attributes of the class.

     Method: A block of code which contains a logic.
        case1. not taking parameters and not also return any value
        case2.  not taking parameters but return a value


     Class Variables
        we can assign values to variables in 3 ways
        1. By using reference variable
        2. By using method
        3. By using constructor

        Constructor is a special type of method.
            1. It is used to initialize the class variable
            2. Must have the same class name
            3. It doesn't return any value not even void
            4. We don't call constructor explicitly. It is invoked at the time of object creation.

            Types of Constructor
            1. Default constructor (Constructors that doesn't accept parameters)
            2. Parameterized constructor

        Diff btw method & Constructor
        1. Name convention - Method can be anything, constructor must be the same name as the class
        2. Constructor doesn't return any value while method does
        3. Methods can be called explicitly while constructors are invoked at the time of creation
        4. Method is used for writing logic but constructors are used to initialize values.

     */
    /*
    Overloading
        Creating methods and constructors with the same name with different parameters.

       Advantages
        1. It saves time and memory.

       Diff methods will be identified by
       1. # of parameters
       2. Data type of parameters

    Overriding
           You can rewrite method body in the child classes.

    Diff btw Overriding and Overloading
    1. In overloading we change the definition of the methods while in overriding we do not change the definition
    of the method, but we change the body of the method.
    2. In overriding you must have two classes

     */

    /*
    Static Keyword
        Static method; Static method can only access static elements
                       Static method can also access non-static elements through object

        Non-Static Method: can access non-static and static elements directly

        Static variables
     */
    /*
    System.out.println()
        class Test{
        static String s="welcome";
        }
        Test.s.length(); // prints 7

        Class System{
        static PrintStream out;
        }
        System.out.println("testing");
     */

    /*
    Inheritance is the concept of acquiring all properties from the Parent/super/base class to the child/sub/derived class
    Types of Inheritance
        1. Single ;;;;use extends keyword;;;;;;;;
        2. Multilevel ;;;;use extends keyword;;;;;;;;
        3. Hierarchical ;;;;use extends keyword;;;;;;;;
        4. Multiple;;;;;;;;;;;; Many Parents one child!  use implement/interface
        5. Hybrid.;;;;;;;;;;;;; ( Combo of Hierarchical and multiple Inheritance) use implement/interface


   Interface
    An interface in java is a blueprint of a class
    Interface contains final and static variables by default
    Interface only contains abstract methods
        An Abstract method is a method that contains a definition without a body
    Methods in interface are public by default
    Interface supports the functionality of multiple inheritance
    We can define interface with interface keyword
    A class extends another class, an interface extends another interface but a class implements an interface
    We can create an object reference for interface, but we cannot instantiate an interface.
        We can however, use the Interface to create the variable and use a class name for instantiation
    Interfaces and classes are logical entities that doesn't have any space in memory until you create an object

    Interface doesnt have much use by itself.
    You can't implement an interface without a class



     */

    /*
    Super Keyword.

    1.Super keyword can be used to refer immediate parent class instance variable
    2.Super keyword can be used to invoke immediate parent class method
    3. super() can be used to invoke immediate parent class constructor
     */

    /*
    Final Keyword
        Final keyword is a constant
        Variables: It can be used for variables meaning you can't change the value of the variable.
        Method: A final method cannot be overridden in the child class
        Class; A final class cannot be extended to a child class

     */

    /*
    Package
        Is a collection of classes/interfaces/other files

        Types of Packages
            1. user defined packages
            2. Built-in packages
     */
    /*
    Access Modifier: Define the scope of variables and methods

        1. Public: No restriction - can be accessed from anywhere

        2. Protected: It can be accessed within and outside the package ONLY by inheritance

        3. Default: It is applicable by default if no other access modified is specified.
                    It is accessible only within the package

        4. Private: Can be accessed only within the class

     */

    /*
    Exception Handling
        It is an abnormal condition that disrupts the execution of the program.
        In java, exception is an event that disrupts the normal flow od the program.

    Types of Exception
        1. Checked > ie Exceptions identified by the compiler during design time.

            Examples: InterruptedException, IOException, FileNotFoundException etc

        2. Unchecked Exceptions -> These are exceptions that are not identified by the compiler at design time
                                    Exceptions identified/thrown at Run-time
            Examples: ArithmeticException, NullPointException, NumberFormatException, ArrayIndexOutOfBoundException

        Note: Unchecked exceptions can only be handled with try/catch block
              Checked exception can be handled in two ways
                a. try/catch block
                b. throws keyword

       Handling Exceptions
        try
        {
        statements;
        }
        catch(Exception Type)
        {
        statements;
        }
     */

}













