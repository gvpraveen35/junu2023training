import java.util.*;
class C
{
public  void disp()
{
System.out.println("method of class c");
}
}
class A extends C
{
public void disp()
{
System.out.println("method of class A");
}
}
class B extends C
{
public  void disp()
{
System.out.println("method of class B");
}
}
class D extends C
{
public  void disp()
{
System.out.println("method of class D");
}
}
class Hirarical
{
public static void main(String args[])
{
D h=new D();
h.disp();
}
}