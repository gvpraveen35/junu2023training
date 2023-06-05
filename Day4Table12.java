import java.util.Scanner;
public class Day4Table12
{
public static void main(String args[])
{
int a;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=0;i<=a;i=i+b)
{
System.out.print(i);
if(i<a)
{
System.out.print(",");
}
}
}
}
