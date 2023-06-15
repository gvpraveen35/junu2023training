class Student
{
public  int id;
public String name;
private void display()
{
System.out.println(this.id+" "+this.name);
}
}
class Test13
{
public static void main(String args[])
{
Student ob=new Student();
ob.display();
ob.id=387;
ob.name="Haritha";
ob.display();
}
}