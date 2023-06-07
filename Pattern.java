import java.util.*;
class Pattern
{
//creating
public static void Testing(char ch,int x)
{
for(int a=1;a<=x;a++)
{
System.out.println();
for(int j=1;j<=a;j++)
{
System.out.print(ch);
}
}
}
// creating
public static void printLine(char c,int col)
{
System.out.println();
for(int j=1;j<=col;j++)
System.out.print(c);
}
public static void printReversePattern(char c,int n)
{
for(int i=n;i>=1;i--)
{
printLine(c,i);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char r=sc.next().charAt(0);
int b=sc.nextInt();
Testing(r,b);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printReversePattern(ch,row);
}
}