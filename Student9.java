import java.util.*;
class Student9
{
int id;
String name;
Student9(int i,String n)
{
id=i;
name=n;
}
Student9(Student9 s)
{
id=s.id;
name=s.name;

}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student9 s1=new Student9(111,"praveen");
Student9 s2=new Student9(s1);
s1.display();
s2.display();
}
}

