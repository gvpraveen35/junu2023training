import java.util.*;
import java.util.Arrays;
class SortElemenr1
{
public static void main(String args[])
{
int n,i=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter aii element");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}}
}
for(int x:a)
System.out.println(x+" ");
}
}