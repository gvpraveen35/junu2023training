import java.util.*;
class Account
{
int id;
String name;
float balence;
void insert(int i,String ss,float sa)
{
id=i;
name=ss;
balence=sa;
}
void doposit(float sa)
{
balence=balence+sa;
System.out.println(sa+"deposited");
}
void withdraw(float sa)
if(balence<sa)
System.out.println("insuffit balence");
}
else
{
balence=balence-sa;
System.out.println(sa+"withdraw")
}
}
void checkbalence()
{
System.out.println(balence is"+balence);
}
void display()
{
System.out.println(id+""+name+""+balence);
}
class TestAccount10
{
public static void main(String args[])
{
Account e1=new Account();
e1.insert(344,"ram",43);
e1.display();
e1.checkbalence();
e1.doposit();
e1.checkbalence();
e1.withdraw();
e1.checkbalence();
}

}

