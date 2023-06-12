import java.util.*;
class PolymorphismExmaple
{
void print()
{
System.out.println("Welcome");
}
void print(String n)
{
System.out.println("Welcome "+n);
}
}
class Text
{
public static void main(String args[])
{
PolymorphismExmaple ob=new PolymorphismExmaple();
ob.print();
Scanner sc=new Scanner(System.in);
System.out.println("please enter u r name");
String s=sc.next();
ob.print(s);
}
}
