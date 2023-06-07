import java.util.*;
class Student8
{
int id;
String name;
int age;
Student8(int i,String n)
{
id=i;
name=n;
}
Student8(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" c"+age);
}
public static void main(String args[])
{
Student8 s1=new Student8(111,"praveen");
Student8 s2=new Student8(112,"kumar",25);
s1.display();
s2.display();
}
}

