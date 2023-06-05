import java.util.*;
class Student
{
int id;
String s;
Student()
{
id=0;
s="null";
}
Student(int i,String ss)
{
id=i;
s=ss;
}

void displayinformation()
{
System.out.println(id+" "+s);
}
}
class Student6
{
public static void main(String args[])
{
Student s1;
s1=new Student();
Student s2=new Student(45,"ko");

s1.displayinformation();
s2.displayinformation();
}

}

