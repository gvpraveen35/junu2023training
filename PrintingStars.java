import java.util.*;
class PrintingStars
{
public static void Print_multiple_chars(int i,char c)
//this
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.println(c);
}
public static void main(String args[])
{
int j=5;
Scanner sc=new Scanner(System.in);
j=sc.nextInt();

Print_multiple_chars(j,'*');
Print_multiple_chars(j+1,'+');
Print_multiple_chars(j-1,'-');
System.out.println("");
}
}
