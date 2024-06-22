# The `switch` statement

The `switch` statement in Java is used for multi-way branching, allowing you to execute different blocks of code based on the value of an expression. It provides a more concise and readable alternative to multiple nested `if-else` statements. Here's the general syntax of a `switch` statement:

```java
switch (expression) {
    case value1:
        // Code to execute if expression matches value1
        break;
    case value2:
        // Code to execute if expression matches value2
        break;
    case value3:
        // Code to execute if expression matches value3
        break;
    // ...
    default:
        // Code to execute if expression doesn't match any case
        break;
}
```

Here's how the `switch` statement works:

1. The `expression` is evaluated, and its value is compared against the values specified in each `case`.

2. If the value of the `expression` matches a `case` value, the corresponding block of code is executed. Execution continues until a `break` statement is encountered, which exits the `switch` block.

3. If no `case` values match the `expression`, the code inside the `default` block is executed. The `default` block is optional and acts as a catch-all case for unmatched values.

4. The `break` statement is used to terminate the execution of a `case` block. Without it, execution would continue into the next `case` block. However, if you want multiple cases to execute the same block of code, you can omit the `break` statement.

Here's an example to illustrate the usage of the `switch` statement:

```java
int dayOfWeek = 2;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    default:
        dayName = "Weekend";
        break;
}

System.out.println("Today is " + dayName);
```

In this example, the `switch` statement matches the value of `dayOfWeek` against different cases. Since `dayOfWeek` has a value of `2`, the code inside the `case 2:` block is executed, assigning the string "Tuesday" to the `dayName` variable. Finally, the result is printed to the console.

It's important to note that the `switch` statement can be used with `int`, `char`, `byte`, `short`, `String`, and `enum` types. Additionally, starting from Java 14, the `switch` statement supports enhanced `switch` expressions with a simplified syntax that allows returning a value directly.

Remember to include the `break` statement to exit the `switch` block after executing the desired code to avoid falling through to the next case unintentionally.






# Assignment Day 4

1. Write a  Program to Make a Simple Calculator Using switch...case

```java
Enter Number 1 : 23
Enter Number 2 : 2

Select Operator + , - , x , / , %
 +

--- Your Result is + : 25       

```
-------
2. Password Checker 

Example : <br><br>
```java
    Set your password :
    p4n@in
    Enter your Password : 
    p4n
    wrong password ... try 2 more time out of 2
    p4n@
    wrong password ... try 1 more time 1
    p4n@34
    wrong password ... try 0 more time 0
    note : user select right password
    then start MCQ EXAM...

    
    1. Who invented Java Programming?
    1. ) Guido van Rossum
    2. ) James Gosling
    3. ) Dennis Ritchie
    4. ) Bjarne Stroustrup

    Select Answer 2

    wrong answer [ Try Next year ] 

    Note :if select Right Answer 
    ask 2nd Question ...

    2. Which component is used to compile, debug and execute the java programs?
    1. ) JRE
    2. ) JIT
    3. ) JDK
    4. ) JVM

    Select Answer 2 ... con..

```

3. Salary System -
   
```java
   -- input section

   Enter Employee Name = Joy
   Enter Employee ID = A001
   Enter Employee Salary (Monthly) = 10000/-
   Enter Leave (Days) = 7
   TDS % = 2
   Month = 3
   year = 2023  

   -- out section
   Name : Joy
   EMP ID : A001
   Monthly Salary : 10,000/-
   CTC (Yearly Salary ) : 120,000/-
   Leave Amount : 2,258.06452/-
   TDS Amount :  200/-
   Final Pay Salary : 7,541.93548/-
   Date = March/2023

```

4. Advance Salary System
```yaml

-- User Input 
----------------
Employee ID  = OA90
Employee Name = Omji
Month = 3
year = 2024
Leaves = 14
Conveyance Allowance = 5%
Medical Allowance = 10%
Other Allowances = 3%
Salary Basic = 56000/-
Professional Tax = 10%
----------------
-- Output
-----------------------
Paid Days = 17 Days
Basic Salary = 56000/-
Total Working Days = 31 
Leaves Amount =  25290.32
Conveyance Allowance = 33600/-  
Medical Allowance =  67200/-
Other Allowances = 20160/-
CTC = 786240/-
Total Allowance = 120960/- 
Professional Tax = 2276.12/-
Total Deductions = 27566.12/-
Total Earnings Allowance  Monthly = 10080/- 
Net Salary   = 28434/-
Month = 	March/2024	

```

##### formula help ?

```yaml



User Input 
----------------
Employee ID  = OA90
Employee Name = Omji
Month = 3
year = 2024
Leaves = 14
Conveyance Allowance = 5%
Medical Allowance = 10%
Other Allowances = 3%
Salary Basic = 56000/-
Professional Tax = 10%
----------------
Paid Days = 17 Days (Leave Days - Month Days)
Basic Salary = 56000/- 
Total Working Days = 31 (Month Days) 
Leaves Amount =  25290.32 (Month Days - Leave Days)
Conveyance Allowance = 33600/-  (Yearly Salary*Conveyance Allowance/100)
Medical Allowance =  67200/- (Yearly Salary*Medical Allowance/100)
Other Allowances = 20160/- (Yearly Salary*Other Allowances/100)
CTC = 786240/- ((Monthly Salary *12)+Conveyance Allowance+Medical Allowance+Other Allowances)
Total Allowance = 120960/- (Conveyance Allowance+Medical Allowance+Other Allowances)
Professional Tax = 2276.12/- (Basic Salary - leave amount ) - (Total Salary*Professional Tax/100)
Total Deductions = 27566.12/- (Professional Tax + Leaves Amount ) - Basic Salary 
Total Earnings Allowance  Monthly = 10080/- (Conveyance Allowance+Medical Allowance+Other Allowances)
Net Salary   = 28434/- (Total Earnings Allowance  Monthly + Basic Salary) - Total Deductions
Month = 	March/2024

```

