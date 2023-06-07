import java.util.*;
class Findsmall
{
public static void main(String args[])
{
int a;
int b;
int c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a<b&&a<c)
{
System.out.println("a is small:"+a);
}
else if(b<a&&b<c)
{
System.out.println("b is small:"+b);
}
else
{
System.out.println("c is small:"+c);
}
}
}

