import java.util.*;
abstract class Bike
{
Bike()
{
System.out.println("bike is created");
}
abstract void run();
void changeGear()
{
System.out.println("grear change");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("running safaly");
}
}
class TestAbstraction2
{
public static void main(String args[])
{
Bike obj=new Honda();
obj.run();
obj.changeGear();
}
}