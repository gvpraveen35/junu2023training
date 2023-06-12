import java.util.Scanner;
class FebonacciSeris
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int sum=0;
int n;
int a=0;
int b=1;
System.out.println("enter u r n th value");
n=sc.nextInt();
System.out.println("Fibinacci seric");
while(sum<=n)
{
System.out.print(sum+" ");
a=b;//swap element
b=sum;
sum=a+b;//next term is the of last two termes
}
}
}