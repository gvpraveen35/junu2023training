import java.util.*;
class FindLarg
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
System.out.println("enter numbers");
if(a>b&&a>c)
{
System.out.println("a is larger:"+a);
}
else if(b>a&&b>c)
{
System.out.println("b is larger:"+b);
}
else
{
System.out.println("c is larger:"+c);
}
}
}

