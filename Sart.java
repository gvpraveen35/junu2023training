import java.util.*;
class Sart
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int sum=0;
int i=0;
int temp=0;
int j=0;
int a[]=new int[x];
for( i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[x-1]);
for(int y:a)
{
sum+=y;
}
float avg=sum/x;
System.out.println(sum+"\n"+avg);
System.out.println("second largest is:"+a[x-2]);
}
}
