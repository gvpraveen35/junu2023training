import java.util.*;
class Even
{
public static  boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("enter any number");
int n;
n=scob.nextInt();
if(n/2*2==n)
{
System.out.println(n);
System.out.println("even ");
}
else
{
System.out.println("odd");
}
}
}
