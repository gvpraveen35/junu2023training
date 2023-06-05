import java.util.*;
class Day5Imp1
{
public static void main(String args[])
{
int a;
int b=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(b<=a)
{
System.out.print(b);
if(b<a)
System.out.print(",");
b++;
}
}
}