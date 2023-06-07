import java.util.*;
class Ex1
{
public static void print_a_star(int i)
{
int a;
for(a=1;a<=i;a++)
{
System.out.println("*");
}
}
public static void main(String args[])
{
int b;
Scanner sc=new Scanner(System.in);
b=sc.nextInt();
print_a_star(b);
System.out.println(" ");
}

}