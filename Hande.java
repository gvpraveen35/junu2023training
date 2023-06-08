import java.util.*;
class Bike234
{
void run()
{
System.out.println("running");
}
}
class Hande extends Bike234
{
void run()
{
System.out.println("running safely with 1000kmph");
}
public static void main(String args[])
{
Hande obh=new Hande();
obh.run();
}
}