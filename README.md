Group Members:

Nabiya Fatima-(BSE173011), 
Iqra Ishtiaq-(BSE173043)


Project Description


Introduction

An Equation in one unknown quantity (let it be x) in the form ax2 + bx + c = 0 is known as a Quadratic equation, where a, b, c are constants and a ≠ 0 while b and c can be zero. Here “a” is called the coefficient of x2, “b” is the coefficient of x and “c” is a constant term. The word “Quadratic” comes from “Quadratum”, the Latin word for square. Hence, a quadratic equation is an equation where the variable is of the second degree. Therefore, a Quadratic equation is also called an “Equation of Degree 2”. Many real-world problems can be studied and solved using Quadratic Equations. Quadratic equations are used in everyday life too, as when calculating areas, determining a product's profit or formulating the speed of an object, projectile motion etc.

Brief Description

In a programming competition the students are required to design a program that takes three numbers (a, b, c) as inputs and determine whether the equation is Quadratic or not. The standard form of Quadratic Equation is ax2+bx+c=0, where a, b, c are constants and “a” cannot be zero. The program should have a method that calculates the nature of the roots of the Quadratic equation weather the roots of the equation are Real, Equal or Imaginary using the discriminant b2-4ac. Following are the conditions that should be meet:

• If b2-4ac>0 the roots are Real and Unequal.

• If b2-4ac=0 the roots are Real and Equal.

• If b2-4ac<0 the roots are Imaginary.

The program should also have a method to calculate the roots of the equation using the formula 𝒙 =−𝒃±√𝒃𝟐−𝟒𝒂𝒄/𝟐𝒂 . Each function should first test whether the inputs will form the Quadratic equation, and then perform the desired functionality; otherwise, the program should display a message “Not a Quadratic Equation”. The problem with the Quadratic Formula is that when using Floating point Arithmetic, it may be subjected to loss of significance in calculating rules of the equation, more similar the two numbers are the precision decreases, so the constants a, b, c should be integer rather than Floating-point numbers or Decimal numbers. The inputs for the constants a, b, c should be within the range from [0,200]. The program should display the following menu:

1. Check the nature of the roots.

2. Calculate the roots of Quadratic equation.
The users can select the above-mentioned options by pressing the number. The program should throw an exception if the user tries to select the invalid option. The program should also handle all the necessary exceptions.
