import java.util.Scanner;
class InputSwap
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("enter the nember");
int a;
a=scob.nextInt();
System.out.println("enter the nember");
int b;
b=scob.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("value of a="+a+"\n"+"value of b="+b);
}
}