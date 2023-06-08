import java.util.*;
class TestOurter
{
static int date=30;
static class Inner
{
void mesg()
{
System.out.println("data is"+date);
}
}
public static void main(String args[])
{
TestOurter.Inner obj=new TestOurter.Inner();
obj.mesg();
}
}