import java.util.*;
class Animal
{
public void move()
{
System.out.println("Animal  can move");
}}

class Dog extends Animal
{
public void move()
{
System.out.println("Dogs can walk and run");
}
}
class testDog
{
public static void main(String args[])
{
Animal a=new Animal();//Animal refferenc and obj
Animal b=new Dog();//Animal refference but Dog object
a.move();
b.move();//rurn the mothod in Dog class
}
}