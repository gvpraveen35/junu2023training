class Student
{
public String name;
public int age;
public String getName()
{
return this.name;
}
public int getAge()
{
return this.age;
}
private void setName(String name)
{
if(name.length()>0)
this.name=name;
else
System.out.println("Name cant be empty");
}
private void setAge(int age)
{
this.age=age;
}
public void display()
{
System.out.println(getName()+" ,"+getAge());
}
public void inputStudentDetails(String n,int a)
{
setName(n);
setAge(a);
}
}
class Test21
{
public static void main(String args[])
{
Student obs1=new Student();
obs1.inputStudentDetails("praveen",19);
Student obs2=new Student();
obs2.inputStudentDetails("",18);
obs2.display();
}
}