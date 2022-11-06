1. Use of Lambda

Lambda can only be used in certain types of interfaces.

1.What is lambda expression?

A lambda expression is a function which can be created without belonging to any class. 
Lambda expressions provides a clear and concise way to represent one method interface using an expression. 
It also improve the Collection libraries making it easier to iterate through, 
filter, and extract data from a Collection.


2. Situation with lambda expression and without lambda expression

Without lambda expression, creating a new constuctor for a normal class is required 
as for creating a new object to implement the method. Or, being more consie compared 
to the lines of anonymous class.


3. How does lambda expression express?

A lambda expression is composed of three parts.
Argument List,	Arrow Token, 	Body (expression)
(int x, int y)	->	x + y

4. Three Types of lambda expression

(int x, int y) -> x + y  // arg with two data type of x & y, return x + y

() -> 42   // no arg and return integer 42

(String s) -> { System.out.println(s); }  // takes a string and then print a string, return nothing



Method reference

  






reference: https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html


