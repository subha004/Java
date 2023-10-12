
//Program to demonstrate constructor overloading - Compile Time Polymorphism
class Point {
private float x;
private float y;
public Point() {
x = 0.0f;
y = 0.0f;
}
public Point(float x) {
this.x = x;
this.y = x;
}
public Point(float x, float y) {
this.x = x;
this.y = y;
}
@Override
public String toString() {
return "Point [x=" + x + ", y=" + y + "]";
}
}
//Program to demonstrate method overloading - Compile Time Polymorphism
class MethodOverloading {
public static int addition(int a, int b) {
return a + b;
}
public static float addition(float a, float b) {
return a + b;
}
public static float addition(int a, float b) {
return a + b;
}
public static float addition(float a, int b) {
return a + b;
}
public static String addition(String a, String b) {
return a + b;
}
}
//Program to demonstrate Overloading - Compile Time Polymorphism
public class Day7_methodOverloading {
public static void main(String[] args) {
System.out.println("------------------------ Constructor Overloading -----------------------");
Point p = new Point(); //default constructor invoked
System.out.println(p);
Point p1 = new Point(14.5f); //single parameter constructor
System.out.println(p1);
Point p2 = new Point(12.5f, 20.50f); //two paramters constructor
System.out.println(p2);
System.out.println("------------------------ Method Overloading -----------------------");
System.out.println("Addition of two integers : " + 
MethodOverloading.addition(10, 20));
System.out.println("Addition of two floating numbers :" + 
MethodOverloading.addition(10.0f, 20.f));
System.out.println("Addition of one integer and one float :" + 
MethodOverloading.addition(10, 20.0f));
System.out.println("Addition of one float and one integer :" + 
MethodOverloading.addition(10.0f, 20));
System.out.println("Addition of two Strings : " + 
MethodOverloading.addition("Hello ", "World"));
}
}