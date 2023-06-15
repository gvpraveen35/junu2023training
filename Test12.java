class Student
{
private  int id;
private String name;
}
class Test12
{
public static void main(String args[])
{
Student ob=new Student();
System.out.println(ob.id+" "+ob.name);
ob.id=387;
ob.name="Haritha";
System.out.println(ob.id+" "+ob.name);
}
}