# Variables in Java

There are three types: 
- Local Variables : 
  ~ A variable defined within a block or method or constructor is called local variable.
  
- Instance Variables: 
  ~ Instance variables are non-static variables and are declared in a class outside any method, constructor or block. As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed. Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used. Initialisation of Instance Variable is not Mandatory. Its default value is 0. Instance Variable can be accessed only by creating objects.

- _Static Variables_ 
  

The Local variables and Instance variables are together called Non-Static variables. Hence it can also be said that the Java variables can be divided into 2 categories: _Static Variables_ and _Non Static Variables_.


##What is static variables?

Static Variables is a variable when it is declared as static, then a single copy of the variable is created and shared among all objects at a class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.

Let's see the example below.

```
public class Vehicles {

  // static variables
  // static variables share the same variables to the whole class, which means any
  // changes relating to this variables will change its original value
  private static int speed = 100;

  static { // static block always execute first
    System.out.println(speed); // print 100
  }

  public Vehicles(int speed) {
    this.speed = speed;
  }

  public int getSpeed(int speed) {
    return speed;
  }

  public static void main(String[] args) {

    // instance variable
    speed = 200; // pass by value
    speed = 300; // a new value will be passed into the static variables and cover its original
                 // value
    System.out.println(speed); // print 300
    System.out.println(Vehicles.speed); // print 300, static varibles can be called by the class itself

    // declare two new object, toyota's speed = 20, benz's speed = 100
    Vehicles toyota = new Vehicles(20);
    Vehicles benz = new Vehicles(100);

    System.out.println(toyota.speed); // print 100
    // that's not what we want! We want "toyota's speed = 20, benz's speed = 100".

    System.out.println(toyota.getSpeed(speed)); //print 100
}
}
```
 Why we fail to get the speed of 20 by getSpeed method? Aren't we just create a new object and pass the speed of 20 into it? Yes, however the variable speed is static, it is shared by all objects of this class, any new changes of this variable will cover the original value.

 #### So what we can do? 
 The way we can do is to do declare a non static variable in class field.

 ### Non Static Variables

```
 public class NonStaticVehicles {

  // non static variables
  private int speed = 100;

  public NonStaticVehicles(int speed) {
    this.speed = speed;
  }

  public static void main(String[] args) {

    //speed = 500; 
    // error, Cannot make a static reference to the non-static field speed

    //  instance variables
    NonStaticVehicles toyota = new NonStaticVehicles(200);
    NonStaticVehicles benz = new NonStaticVehicles(300);

    System.out.println(toyota.speed); // print 200  
    System.out.println(benz.speed); // print 300

    //System.out.println(NonStaticVehicles.speed);
    // error, Cannot make a static reference to the non-static field NonStaticVehicles.speed
  }
}
```

 ### Difference between static and non-static variables in Java

 

The main differences between static and non static variables are:



| Static variable                                                            | Non static variable                                                                                     |
| :------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------ |
| Static variables can be accessed using class name                          | Non static variables can be accessed using instance of a class                                          |
| Static variables can be accessed by static and non static methods          | Non static variables cannot be accessed inside a static method.                                         |
| Static variables reduce the amount of memory used by a program.            | Non static variables do not reduce the amount of memory used by a program                               |
| Static variables are shared among all instances of a class.                | Non static variables are specific to that instance of a class.                                          |
| Static variable is like a global variable and is available to all methods. | Non static variable is like a local variable and they can be accessed through only instance of a class. |

