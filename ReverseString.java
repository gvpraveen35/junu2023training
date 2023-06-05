import java.util.*;
class ReverseString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
String s1="";
s=sc.next();
int len=s.length()-1;
for(int i=len;i>=0;i--)
{
s1=s1+s.charAt(i);
}
System.out.println(s1);
}
}