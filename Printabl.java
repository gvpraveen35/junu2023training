interface Printabl
{
void print();
}
interface Showable
{
void show();
}
class A implements Printabl,Showable
{
public void print()
{
System.out.println("hello");
}
public void show()
{
System.out.println("welcome");
}
public static void main(String args[])
{
A obj=new A();
obj.print();
obj.show();
}
}