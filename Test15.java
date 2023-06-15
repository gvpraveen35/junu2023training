class Student
{
public  int id;
public String name;
private void display()
{
System.out.println(this.id+" "+this.name);
}
public void displayStudent()
{
display();
}
}
class Test15
{
public static void main(String args[])
{
Student ob=new Student();
ob.displayStudent();
ob.id=387;
ob.name="Haritha";
ob.displayStudent();
}
}