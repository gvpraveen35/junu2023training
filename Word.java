import java.util.*;
class Word
{
public static void main(String args[])
{
String s;
String c;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
c=sc.next();
int b=s.charAt(0);
for(int i=1;i<=s.length()-1;i++)
{
if(c!=b)
{
System.out.print(s.charAt(i));
}
}}
}