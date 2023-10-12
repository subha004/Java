//Program to guess a number in a given range

public class Day2  {
public static void main(String[] args) {
int x = 5;
if (x != 5)
System.out.println("Value of x is not 5");
System.out.println("Value of x is 5");

//Program to demonstrate if..else statement

int age=11;
if(age>=18)
System.out.println(" You are eligible for Voting"); 
else
System.out.println("Sorry! You need to wait more");
System.out.println("if else demonstration");

//Nestedifelse

int a=10, b=20, c=5;
System.out.println("The largest number is");
if (a > b) {
if (a > c)
System.out.println(a);
else
System.out.println(c);
} else {
if (c > b)
System.out.println(c);
else
System.out.println(b);
}

//Program to demonstrate Switch case

char x6 = 'l';
switch (x6) 
{
case 'l' : 
case 'L' :
System.out.println(x6+" is a Letter");
break;
case 'd':
case 'D' :
System.out.println(x6+" is a Digit");
break;
case 'w':
case 'W' : 
System.out.println(x6+" is White Space");
break;
case 's':
case 'S':
System.out.println(x6+" is Special Symbol");
default:
System.out.println(x6+" is other than letter, digit, space or special symbol ");
break;
}

//Program to demonstrate decision making operators

int x1 = 8, y = 7;
int a1 = 10;
int b1 = 11;
if (x1 >= y) {
System.out.println("true");
} else {
System.out.println("false");
}
if (!(a1 < b1) || (a1 == b1)) {
System.out.println("Condition is TRUE");
} else
{
System.out.println("Condition is FALSE");
}

//Program to demonstrate while do loop

int i=99;
while(i<=100)
{
System.out.println(i);
i++;
}

//Program to demonstrate for loop

for(int i1 = 1; i1<=1000 ; i1++) //(int i = 1000; i<=1;i--)
{ 
System.out.print("Value of i:");
System.out.println(i1);
}

//Program to demonstrate for each loop

int a2[]= {10,20,30,40,50}; 
//for integer array
for(int i2:a2)
{
System.out.println(i2); 
}
char ch[]= {'j','a','v','a'};
for(char c1:ch)
{
System.out.print(c1); 
}
System.out.println(" ");
String s1[]= {"Java","programming","learning"};
//for String array
for(String s:s1)
{
System.out.print(s+" "); 
}

//Program to demonstrate do while loop

int i3 = 11;
do {
System.out.println(i3);
i3++;
} while (i3 <= 1);

//Program to demonstrate different operators(ternary,airthmetic,pre/post incrementation/decrementation) in java

int a7 = 10;
int b7 = 20;
int x7 = 10;
System.out.println("a and b value before the operations: "+ a7 + " " + b7);
++a7;
int c7 = ++a7 + b7 + a7--;
System.out.println("c value after the operations: " + c7);
int d7 = c7++ + a7 + b7--;
System.out.println("d value after the operations: " + d7);
System.out.println("a , b,c,d values after the operations: " + a7 + " " + b7 + " " + c7 + " " + d7);

//Ternary operator demonstration
int x8=1;
x8 = (10 == x8) ? 1 : 0; 
System.out.println(x8);

//Program to demonstrate continue statement

for (int k = 5; k < 15; k++)
{
// Odd numbers are skipped
if (k%2 != 0)
continue;
// Even numbers are printed
System.out.print(k + " ");
}

//Program to demonstrate break statement

for (int i8 = 5; i8 < 10; i8++) {
if (i8 == 5)
break;
System.out.println(i8);
}
}
}

