
//Program to demonstrate static block
class MyClass {
private int section ; //non-static or instance variable
private static int srNo; //static or class variable
//static Block
static
{
System.out.println("-----------Within Static Block---------");
srNo=1000;
}
//default constructor
MyClass()
{
System.out.println("--------------Within Default Constructor-----------");
srNo++;
section++; 
}
@Override
public String toString() {
return "MyClass [Serial No "+srNo+", Section=" + section + "]";
}
//static method
static void display() 
{
//System.out.println("Section : "+section); //can't access non static members
System.out.println("Serial No. "+srNo); 
}
}
//Program to demonstrate static method
public class Day6_staticMethod {
public static void main(String[] args) {
MyClass o1 = new MyClass();
System.out.println(o1);
//static method with class name
MyClass.display();
MyClass o2 = new MyClass();
System.out.println(o2);
MyClass.display();
MyClass o3 = new MyClass();
System.out.println(o3);
MyClass.display();
}
}