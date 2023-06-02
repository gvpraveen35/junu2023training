import java.util.*;
public class Pro1
{
public static void main(String args[])
{
char ch;
System.out.println("entre chareter");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+"is an alphabet");
}
else if(ch<='0'&& ch>='9')
{
System.out.println(ch+"is not an digit");
}
else
{
System.out.println("at is an speicl");
}
}
}