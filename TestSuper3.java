import java.util.*;
class Animal
{
 Animal()
{
System.out.println("animal is creates");
}
}
class Dog extends Animal
{
Dog()
{
super();
System.out.println("dog is created");
}
}

class TestSuper3
{
public static void main(String args[])
{
Dog a=new Dog();

}
}

