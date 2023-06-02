import java.util.*;
public class Program3
{
static int diff(int a,int b)
{
return a-b;
}
static int product(int a,int b)
{
return a*b;
}
static int smallest(int a,int b)
{
if(a>b)
return a;
if(b>a)
return b;
return 0;
static int largest(int a,int b)
if(a>b) return a;
if(b>a) return b;
return 0;
public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.println("enter the value");
num1=sc.nextInt();
System.out.println("enter the value");
num2=sc.nextInt();
result=diff(num1,num2);//test a
System.out.println("difference is "+result);
result=prodect(num1,num2);//test b
System.out.println("prodect is "+result);
result=smallest(num1,num2);//test c
System.out.println("smallest is "+result);
result=smallest(num1,num2);//test d
System.out.println("smallest is "+result);
}
}