import java.util.*;
class Employee
{
float salary=90000;
}
class Progremer extends Employee
{
int bonus=10000;
public static void main(String args[])
{
Progremer p=new Progremer();
System.out.println("Progremer salary is:"+p.salary);
System.out.println(" bonus of Progremer is:"+p.bonus);
}
}