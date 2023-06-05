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
void display()
{
System.out.println(id+" "+name+" "+balence);
}
}
 class TestAccount
{
public static void main(String args[])
{
Account e1=new Account();
Account e2=new Account();
Account e3=new Account();
e1.insert(1,"one",20);
e2.insert(2,"two",30);
e3.insert(3,"three",40);
e1.display();
e2.display();
e3.display();
}

}

