import java.util.*;
class Prime
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=a;i++)
{
if(a%i==0)
{
count++;
System.out.print(i);
if(i<a)
{
System.out.print(",");
}
}
}
if(count==2)
{
System.out.println("\nPRIME");
}
else
{
System.out.println("\nNOT PRIME");
}


}//mo
}//cl

