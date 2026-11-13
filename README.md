Answering the questions to Warmup.java

The output that I predicted was:
7 5.0 127
"Two" "Three"

The actual output was:
7 5.0 -126
"Two" "Three"

Explanation:
When int a is typecast in to int itself it rounds off the number and
provides the vaue without decimal which is 7 as exected.

When int x is converted into double, it holds a decimal value and
adds .0 to the int which gives 5.0

When a number in int is converted into its byte, 
since byte can only store values from 127 to -126 and the integer value is above it, 
it stores the lowest value which -126 as default.

When int day is 2 is printed without a break statement in the switch cases, 
it prints the day 2 as well as the next day then exits the code. 
That is why 2 and 3 are printed. 

Questions related to Main.java: 
Q1. What is the difference between a static variable and an instance variable?
A static variable is a variable which belongs to the class and
it can be accessed or used by all the objects.
An instance variable belongs to an object or individual object. 
In cafe_inventory_manager, we use:
totalProducts - static variable
name, price and quantity - instance variables.

Q2. What is the purpose of a constructor?
A constructor is used to initialize an object when it is created.
We used three constructors in our project - 
* No-argument constructor
* Parameterized constructor
* Copy constructor

Q3. What is a copy constructor?
A copy constructor is used to create a new object by copying the values of an existing object.

Q4. Why do we use this keyword?
The this keyword is use to represent the current object. 
It helps to distinguish between instance variables from constructor parameters
when they have the same name.

Q5. What is the purpose of stockValue()?
It calculates the total stock value of a product by multiplying price and quantity.
double stockValue() {
return price * quantity;
}

Q6. Why do we use (int) average?
It removes the decimal point so it is great for a round-up figure.
double average = 12.75;
System.out.println((int) average);
OUTPUT - 12

Q7. Why do we use products[num - 1] instead of products[num]?
Java arrays start from index 0, but our menu displays product numbers starting from 1.
Therefore, we subtract 1 to access the correct product.