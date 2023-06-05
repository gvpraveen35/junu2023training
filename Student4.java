import java.util.*;
class Student1
{
int id;
String s;
void insertrecord(int i,String ss)
{
id=i;
s=ss;
}

void displayinformation()
{
System.out.println(id+" "+s);
}
}
class Student4
{
public static void main(String args[])
{
Student1 s1;
s1=new Student1();
Student1 s2=new Student1();
s1.insertrecord(23,"gv");
s2.insertrecord(43,"pra");
s1.displayinformation();
s2.displayinformation();
}

}

