import java.util.*;
import java.util.Arrays;
class SortElements
{
public static void main(String args[])
{
int n,i=0;
Scanner s=new Scanner(System.in);
System.out.prtintln("enter no of element u want");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int j:a)
{
System.out.print(j+" ");
}
}
}
S