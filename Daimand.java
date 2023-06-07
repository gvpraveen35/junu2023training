import java.util.*;

class Daimand
{
public static void Daimand(int s ,char c)
{
for(int i=0;i<=s;i++)
{
System.out.println();

for(int j=0;j<=i;j++)
{

System.out.print(c);
}}
}
public static void main(String args[])
{
int a;
char c1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
c1=sc.next().charAt(0);
Daimand(a,c1);
}
}
