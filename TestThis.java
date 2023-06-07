import java.util.*;
class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}
class TestThis
{
public static void main(String args[])
{
Student s1=new Student(111,"praveen",5000f);
Student s2=new Student(111,"pravee",6000f);
Student s3=new Student(111,"prave",7000f);
s1.display();
s2.display();
s3.display();
}
}
