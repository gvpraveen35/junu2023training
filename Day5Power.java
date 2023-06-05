import java.util.*;
class Day5Power
{
public static void main(String arg[])
{
int a;
int b;
int c=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=1;i<=b;i++)
{
c=c*a;
}
System.out.println("power is:"+c);
}
}

