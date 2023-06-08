import java.util.*;
class Student101
{
int rollno;
String name;
static String college="its";
static void change()
{
college="MTIET";
}
Student101(int i,String n)
{
rollno=i;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
Student101.change();
Student101 s1=new Student101(111,"gv");
Student101 s2=new Student101(222,"praveen");
s1.display();
s2.display();
}
}