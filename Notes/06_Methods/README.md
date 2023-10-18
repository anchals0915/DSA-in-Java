
     Function
 access_modifier return_type name (dataype arguement)
 {

 }


    How to Call a Method in Java
In Java, the method is a collection of statements that performs a specific task or operation. It is widely used because it provides reusability of code means that write once and use it many times. It also provides easy modification. Each method has its own name by which it is called. When the compiler reads the method name, the method is called and performs the specified task. In this section, we will learn how to call pre-defined, user-defined, static, and abstract methods in Java.

Calling Static Method in Java
In Java, a static method is a method that is invoked or called without creating the object of the class in which the method is defined. All the methods that have static keyword before the method name are known as static methods. We can also create a static method by using the static keyword before the method name. We can call a static method by using the ClassName.methodName.

The best example of the static method is the main() method. It is called without creating the object.



In the following program, we have called the static method of the Math class, named min() that returns the minimum value of two numbers.

StaticMethodCallExample.java

import java.util.*;  
public class StaticMethodCallExample  
{  
public static void main(String args[])   
{  
int a;  
//calling static method of the Math class  
a=Math.min(23,98);  
System.out.println("Minimum number is: " + a);  
}  
}  
Output:

Minimum number is 23
Calling the Pre-Defined Method in Java
In Java, pre-defined methods are the methods that are already defined in the classes. When we required any pre-defined method, we just call the method by its name.

In the following example, we have used a method named hashCode() of the class Object. To call the pre-defined method hashCode(), we have created an object obj of the Object class because it is the method of the Object class. By using the object we have called the hashCode() method that returns a hash code value for the object.

PredefinedMethodCallExample.java

public class PredefinedMethodCallExample  
{  
public static void main(String[] args)   
{  
int a;      
Object obj=new Object();      
a=obj.hashCode();  
System.out.println("Hash Code of the object is: "+a);  
}  
}  
Output:

Hash Code of the object is: 2036368507
Calling User-Defined Method in Java
To call a user-defined method, first, we create a method and then call it. A method must be created in the class with the name of the method, followed by parentheses (). The method definition consists of a method header and method body.

We can call a method by using the following:

method_name();  //non static method calling  
If the method is a static method, we use the following:


freestar
obj.method_name();   //static method calling  
Where obj is the object of the class.

In the following example, we have created two user-defined methods named showMessage() and displayMessage(). The showMessage() method is a static method and displayMessage() method is a non-static method.

Note that we have called the showMessage() method directly, without using the object. While the displayMessage() method is called by using the object of the class.

MethodCallExample.java

public class MethodCallExample  
{  
//user-defined static method  
static void showMessage()   
{  
System.out.println("The static method invoked.");  
}  
//user-defined non-static method  
void displayMessage()   
{  
System.out.println("Non-static method invoked.");  
}  
public static void main(String[] args)   
{  
//calling static method without using the object  
showMessage(); //called method  
//creating an object of the class  
MethodCallExample me=new MethodCallExample();  
//calling non-static method  
me.displayMessage(); //called method  
}  
}  
Output:

The static method invoked.
Non-static method invoked.
A class can contain two or more methods with the same name. Now a question arises that how we can call two methods with the same name.


freestar
When a class has two or more methods with the same name it is differentiated by either return type or types of parameter or number of parameters. This concept is called method overloading. For example:

int sum(int x, int y);  
double sum(double x, double y);  
The above two methods have the same name sum() but both are different. The first sum() method returns an int value and parses two integer x and y as parameters. While the second sum() method returns a double value and parses two double values a and y as parameters.

Let's create a program that overloads sub() method.

MethodOverloadingExample.java

public class MethodOverloadingExample  
{  
static int sub(int x, int y)   
{  
return x - y;  
}  
static double sub(double x, double y)   
{  
return x - y;  
}  
public static void main(String[] args)   
{  
int a = sub(45, 23);  
double b = sub(23.67,10.5);  
System.out.println("subtraction of integer values: " +a);  
System.out.println("subtraction of double values: " +b);  
}  
}  
Output:

subtraction of integer values: 22
subtraction of double values: 13.170000000000002
Calling Abstract Method in Java
An abstract method is a method that is declared with an abstract keyword. The abstract method only has a method declaration. The body of the abstract method defined in the other class. the abstract method must be declared in the abstract class. We can set visibility of abstract methods as private or public. We cannot declare an abstract method as final because it violates the advantage of the abstract method.

The actual implementation of the abstract method must be in the child's class. We can define an abstract method as follows:

abstract public void findArea();  
Let's create an example of calling the abstract method.

In the following example, we have created a class with the name AbstractMethodExample and declare it as abstract. In this class, we have declared an abstract method named show(). After that, we have created another class named AbstractMethodCalling that extends the AbstractMethodExample class. In this class, we have implemented the abstract method.

To call the abstract method show(), we have created an instance of the parent class and invoked the abstract method.

AbstractMethodCalling.java

//abstract class  
abstract class AbstractMethodExample   
{    
//abstract method declaration  
abstract void show();    
}    
public class AbstractMethodCalling extends AbstractMethodExample  
{    
//abstract method implementation      
void show()  
{  
System.out.println("The abstract method called.");  
}    
public static void main(String args[])  
{    
AbstractMethodExample obj = new AbstractMethodCalling();    
//calling abstract method   
obj.show();    
}    
}    
Output:


freestar
The abstract method called.
 */