import java.util.*;
class NumberPatter2
{
public static void PrintLine(int n)
{
for(int i=1;i<=n;i++)
{
System.out.print(i);
}
}
public static void printPattern(int n)
{
for(int i=n;i>=1;i--)
{
System.out.print("\n");

PrintLine(i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPattern(n);
}
}


