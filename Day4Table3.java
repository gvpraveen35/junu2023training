import java.util.Scanner;
public class Day4Table3
{
public static void main(String args[])
{
int a;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
String str="";
for(int i=0;i<=a;i=i+b)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));


}
}

