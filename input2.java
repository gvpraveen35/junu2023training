import java.util.Scanner;
class Input2
{
public static int sub(int a,int b)
{
int c=a/b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("enter the nember");
int a;
a=scob.nextInt();
System.out.println("enter the nember");
int b;
b=scob.nextInt();
int c=sub(a,b);
System.out.println(a+"/"+b+"="+c);
}
}