import java.util.*;
class Student11
{
int id;
String name;
Student11(int i,String n)
{
id=i;
name=n;
}
Student11()
{}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student11 s1=new Student11(111,"praveen");
Student11 s2=new Student11();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}
