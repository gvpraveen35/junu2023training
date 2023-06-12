import java.util.*;
abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
void draw()
{
System.out.println("drawing rectengl");
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("drew circlr");
}
}
class TestAbstract
{
public static void main(String args[])
{
Shape s=new Circle();
s.draw();
Shape r=new Rectangle();
r.draw();
}
}