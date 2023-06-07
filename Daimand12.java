import java.util.*;

class Daimand12
{
public static void Daimand(char c,int col)
{
System.out.println();
for(int j=0;j<=col;j++)
{
System.out.print(c);
}}
public static void Daimand1(char c,int n){
for(int i=0;i>=n;i--)
{
Daimand(c,i);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
char ch=sc.next().charAt(0);
Daimand1(ch,row);

}
}

