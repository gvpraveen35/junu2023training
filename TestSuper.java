import java.util.*;
class Animal
{
String color="white";
}
class Dog extends Animal
{
String color="black";
void printColor()
{
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper
{
public static void main(String args[])
{
Dog d=new Dog();
d.printColor();
}
}
