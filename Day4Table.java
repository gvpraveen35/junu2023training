import java.util.Scanner;
public class Day4Table
{
public static void main(String args[])
{
int a;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(b=0;b<=10;b++)
{
System.out.println(a+"*"+b+"="+(a*b));
}
}
}
