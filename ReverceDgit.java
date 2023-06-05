import java.util.*;
class ReverceDgit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.println("Enter any positivi interger");
n=sc.nextInt();
while(n>0)
{
sd=sd*10+n%10;
n=n/10;
}
System.out.println(sd);
}
}


