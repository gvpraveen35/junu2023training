import java.util.*;
class Car
{
final void run()
{
System.out.println("runnig....");
}
}
class Boor extends Car
{
public static void main(String args[])
{
new Boor().run();
}
}