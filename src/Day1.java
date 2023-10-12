//Day 1
//1.Demonstration of simple java program

public class Day1 {
public static void main(String[] args) {
System.out.println("Hello World");

//2.program to demonstrate char data type 

//assigning single character literal
char ch = 'a';
System.out.println(ch);
//assigning number to char
char ch1 = 65;
System.out.println(ch1);
//assigning unicode to char
char var1 = '\u00A7';
System.out.println(var1);
//Unicode representation
char var2 = '\u20AC';
System.out.println(var2);
//ASCI code representation
int a = 'A';
System.out.println(a);

//3.Program to demonstrate Data types

int value1 = 9 / 2; //integer division
float value2 = 101 / 61;
double value3 = 10d / 6d;
float value4 = 5/2.5f; //float division
System.out.println("value 1=" + value1); 
System.out.println("value 2=" + value2);
System.out.println("value 3=" + value3);
System.out.println("value 4=" + value4);
int marker = 512;
//assigning expression to variable 
double percentage = marker * 0.46f;
System.out.println("percentage :" + percentage);

//4.Program to demonstrate identifiers 

//variable declaration - Invalid Identifier Examples
/* int for = 13;// error because keyword cannot be 
identifier
System.out.println("value of the number variable is : "+ 
for);*/
/*
int number 2 = 13; //error because do not add space within 
identifier
System.out.println("value of the number variable is : "+ 
number 2);
*/
//error because Identifier can not starts with @, #
//int @number3 = 10;
//Valid Identifier Examples
int $number = 20; //starts with $
System.out.println("value of the number variable is : "+ 
$number);
String studentName="Aniket"; //use camelcase
System.out.println("value is : "+ studentName);

//5.Program to demonstrate data types 

//byte takes 1 byte
byte byteMax = 127;
byte byteMin = -128;
System.out.println("Min range of byte is" +
byteMin+"Max range of byte is "+byteMax);
//short - 2 bytes
short shortMax = 32767;
short shortMin = -32768;
System.out.println("Minshort range of byte is" +shortMin+"Maxshort range of byte is "+shortMax);
//int - 4bytes
int maxInt = 2147483647;
int minInt = -2147483648;
System.out.println("Minint range of byte is" +minInt+"Maxint range of byte is "+maxInt);
//long - 8bytes
long maxLong = 9223372036854775807L;
long minLong = -9223372036854775808L;
System.out.println("Minlong range of byte is" +
minLong+"Maxlong range of byte is "+maxLong);
float f=3234.141243278345f;
double d=3456.14124512345678902345678914f;
System.out.println("float value is "+f+" double value is "+d);
//boolean 
boolean flag=false;
System.out.println("boolean value is "+flag);

//6.Program to demonstrate type casting between primitive types

//widening / implicit type casting
byte b = 10;
int i = b;
System.out.println(i);
float f1 = 22.14f;
double d1 = f1;
System.out.println(d1);
char ch10 = 'A';
int i3 = ch10;
System.out.println(i3);
char var10 = '\u00A7';
int i4 = var10;
System.out.println(i4);
//narrowing/explicit type casting
double f10 = 10.52f;
long l = (long) f10;
System.out.println(l);
long l1 = 923372036854775806l;
int i2 = (int) l1;
System.out.println(i2);
float f2 = 34.56f;
int i1 = (int) f2;
System.out.println(i1);
byte b1 = 90;
char ch11 = (char) b1;
System.out.println(ch1);
}
}