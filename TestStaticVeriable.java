import java.util.*;
class Student
{
int rollno;
String name;
static String college="MTIET";//Static veriable
//constructor
Student(int r,String n)
{
rollno=r;
name=n;
}
//mothed to display the value
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticVeriable
{
public static void main(String args[])
{
Student s1=new Student(111,"praveen");
Student s2=new Student(112,"kumar");
Student.college="mothertheresa";
s1.display();
s2.display();
}
}