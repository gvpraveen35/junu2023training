import java.util.*;
class Super
{
void eat()
{
System.out.println("eating..");
}
}
class Dog extends Super
{
void eat()
{
System.out.println("eating bread.....");
}
void bark()
{
System.out.println("barking...........");
}
void work()
{
super.eat();
 bark();
}
}
class TestSuper
{
public static void main(String args[])
{
Dog a=new Dog();
a.work();
}
}
