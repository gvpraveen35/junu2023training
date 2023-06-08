import java.util.*;
class s2
{
void m(s2 obj)
{
System.out.println("mothed in invoked");
}
void p()
{
m(this);//m(s1);
}
public static void main(String args[])
{
s2 s1=new s2();
s1.p();
}
}