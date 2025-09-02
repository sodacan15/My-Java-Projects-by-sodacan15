CALCULATOR PROJECT FOR JAVA

Goal: To create a console-based calculator that can form mathematical opertions.

VERSION 1.0
> Started: September 01, 2025
> Ended: ???

**VERSION 1.0: Manual Version**

*Mechanics:*
1. Insert two numerical values, either an integer or a double.
-> If the input is erroneuous, the system will prompt the user to try and input and accurate value.

2. After inserting the two values, the user is expected to choose an opperand. For this operation, the available operations are: addition, subtraction, multiplication, division, and % division.

3. The program will the calculate the result and show the answer. If the user wishes to continue the following will happen:

-> The screen will be wiped
-> The answer will be assigned to the first variable.
-> Only the input of second value will procede.

4.) Once the user decided to finish, the program will thank them for their time and terminate.

**VERSION 1.1: Improvement on the Manual Version**
-> In this version update, I wanted to introduce new changes to the calculator that can improve its performance. Instead of a manual variable by variable system, I wanted to change the system to become a type and parse program.

>> Parsing mechanics
1. The user will enter a series of equation and the program will seperate them if they are an opperand or a number.

2. If there is an error, the parsing will be halted and a warning will be sent to the user to input a new equation.

3. Then, the program will use the first item of the array and the second item in the array and compute them accordingly.

Note: For this version, the same operations are still done as the previous.

-> NOTES FOR IMPROVEMENTS:
* New form of calculation is to be added. Namely: sin( , cos( , tan( , and and ^n (exponent)
* Needs improvement in the parsing process, namely:
  * Needs to account for parenthesis which complicates solutions and adds complexity of the operation.
  * Algebraic and trigonometric expressions can be added on the future.
  * Chop Chop Method: Chops the expressions based on the parenthesis.


