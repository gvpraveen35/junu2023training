import java.util.Scanner;
public class Day4Table4
{
public static void main(String args[])
{
int a;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
a=a+b;//2+3=5
b=a-b;//3-5=-2
a=a-b;//
System.out.print(a);
System.out.print(" ");
System.out.print(b);}
}