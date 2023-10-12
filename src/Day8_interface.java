
//Interface Examples
//Program to define Person class

class Person2 {
private String name;
private String city;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public Person2(String name, String city) {
super();
this.name = name;
this.city = city;
}
public Person2() {
super();
}
}
//Program to define Bank interface

interface Bank {
static final float MINBAL=5000;
static final float DEPOSIT_LIMIT=25000; 
public void deposit(float amount);
public void withdraw(float amount);
}
//Program to implement interface

//Person
class SavingAccount extends Person2 implements Bank 
{
private int accNo;
private float balance;
public SavingAccount(String name, String city, int accNo, float balance) {
super(name, city);
this.accNo = accNo;
this.balance = balance;
}
public int getAccNo() {
return accNo;
}
public void setAccNo(int accNo) {
this.accNo = accNo;
}
public float getBalance() {
return balance;
}
public void setBalance(float balance) {
this.balance = balance;
}
//implements Bank method
@Override
public void deposit(float amount) {
if (amount > DEPOSIT_LIMIT)
System.out.println("Daily limit exceeds...");
else {
balance += amount;
System.out.println("Rs. "+amount+" deposited successfully..." );
}
}
//implements Bank method
@Override
public void withdraw(float amount) {
if (amount <= balance - MINBAL) {
balance -= amount;
System.out.println("Rs. "+amount+" withdraw successfully..");
} else
System.out.println("Insufficient Balance...can't withdraw");
}
@Override
public String toString() {
return "SavingAccount [Name =" + getName() + "\tCity = " + 
getCity() + "\taccNo=" + accNo + ", balance="
+ balance + "]";
}
}
//Program to demonstrate interface

public class Day8_interface {
public static void main(String[] args) {
SavingAccount sa=new SavingAccount("Amit", "Pune", 101, 45000);
System.out.println(sa);
sa.deposit(12000);
System.out.println(sa);
sa.withdraw(5000);
System.out.println(sa);
sa.withdraw(70000);
System.out.println(sa);
sa.deposit(120000);
System.out.println(sa);
}
}