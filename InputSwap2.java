import java.util.Scanner;
class InputSwap2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a;
a=scob.nextInt();
int b;
b=scob.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+"\n"+b);
}
}