# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.
* Scan through all the existing code and note what you have to work with.
    * Method names 
_**convertC2F, convertC2K, convertF2C, convertF2K, convertK2C, getTemp, getUnitChoice, main**_
    * Variables 
_**input**_
  
* Using Java terminology, break down every piece of the method **convertF2K**.
    * What is the access modifier? 
_**Public**_
  * Is it a class or object method, how do you know? 
_**It's an object method because it doesn't say class it says static, and it has parameters and returns something.**_
   * What is its return type? 
_**Double**_
   * What parameters does it require, and what are the parameter(s) datatype(s)? 
_**Fahrenheit in double form.**_
   * Describe for me how the body of the method executes (i.e. its flow of execution). 
_**It takes the fahrenheit and runs it through the convertF2C method and then runs it through convertC2K. So it's taking a double that is in fahrenheit converts it to celsius then converts that to kelvin.**_

* Using Java terminology, break down method **getUnitChoice**.
    * What is the access modifier? 
_**Public**_
* Is it a class or object method, how do you know?
_**It's an object method because it doesn't say class it says static, and it has parameters and returns something.**_
    * What is its return type?
**_String_**
    * What parameters does it require, and what are the parameter(s) datatype(s)?
**_No parameters or parameter datatypes set_**
    * Describe for me how the body of the method executes (i.e. its flow of execution).
**_If called in the main method it prints four formatted strings and returns the input of the scanner._**
    * How do the format specifiers differ than what you've seen before and what do they do?
_**It looks like %-4s adds right-padded four spaces in the string before the colon, and the %40s adds left-padded 40 spaces**_ 

## Part 2: - Implement Missing Method: convertK2F
This Part is aimed at teaching you to use methods and code you have to add new functionality to existing code. In this case you will add the missing conversion method, but you don't need to know math :-)
* Hint: You can use existing methods!


## Part 3: - Switch it Up
Part 3 is all about learning how to use the **switch** conditional statement, or the **enhanced switch** statement. You've learned about **if/else** now you will learn about **switch**.
* Using the provided method and class variables, write a program in the **while** loop of the **main** method that:
    * Requests a temperature Unit to convert from
    * Requests a temperature Unit to convert to
    * Quits the program if Q is entered for either choice
    * Requests the double temperature value to convert
    * Uses a **switch** or **enhanced switch** conditional to call the proper conversion method.
    * Prints out the result as indicated below:

          Result 40.000000°C is 104.000000°F

## Part 4: Pull Request
Part 4, as usual, is repetition of duties you will be doing in industry.
* Make sure to use the Git tab at the bottom of IntelliJ to create a Fall_2022 feature branch
* Commit and Push your running code back to your GitHub account
* Issue a Pull request back to my Java-Assignment-005 repo
* Cut and Paste the Pull request URL into your Canvas assignment to turn it in.