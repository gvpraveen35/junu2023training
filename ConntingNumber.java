import java.util.*;
class ConntingNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String res="";
for(int i=0;i<=s1.length()-1;i++)
{
if(s1.charAt(i)>='0'&& s1.charAt(i)<='9')
{
res=res+s1.charAt(i);
}
}
System.out.println(res);
}
}
