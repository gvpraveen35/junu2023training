import java.util.*;
class Star
{
public static void main(String args[])
{
String a;
int  b;
Scanner sc=new Scanner(System.in);
a=sc.next();
b=sc.nextInt();
for(int i=b;b>0;b--)
{
for(int j=1;j<i;j++)
{
System.out.print(a);
}
System.out.println();
}
}
}

