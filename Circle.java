import java.util.*;
class Opertion
{
int square(int n)
{
return n*n;
}
}
class Circle
{
Opertion op;
double pi=3.14;
double area(int radius)
{
op=new Opertion();
int rsquare=op.square(radius);
return pi*rsquare;
}
public static void main(String args[])
{
Circle c=new Circle();
double result=c.area(5);
System.out.println(result);
}
}