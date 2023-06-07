import java.util.*;
class Student123
{
int rollon;
String name,course;
float fee;
Student123(int rollon,String name, String course)
{
this.rollon=rollon;
this.name=name;
this.course=course;
}

Student123(int rollon,String name,String course,float fee)
{
this(rollon,name,course);
this.fee=fee;
}

void display()
{
System.out.println(rollon+" "+name+" "+course+" "+fee);
}
}
class TestThis123
{
public static void main(String args[])
{
Student123 s1=new Student123(111,"gv","java");
Student123 s2=new Student123(111,"gv","java",50000f);
s1.display();
s2.display();
}
}
