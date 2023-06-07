//chack the interes polinrom or not
import java.util.*;
class Day6PalindromeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int re=0;
int rem;
int temp;
temp=num;
while(temp !=0)
{
rem=temp%10;
re=re*10+rem;
temp/=10;
};
if(num==re)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}}
