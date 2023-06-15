class Student
{
public  int id;
public String name;
}
class Test11
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