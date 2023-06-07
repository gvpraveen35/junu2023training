import java.util.*;
class ReversofaString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
s=s.toLowerCase();
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
//System.out.println(s+" "+res);
if(s.equals(rev))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}