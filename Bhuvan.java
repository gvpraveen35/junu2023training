class Arun
{
public void flowers()
{
System.out.println("Fun A1 called from class Arun");
}
public void fourt()
{
System.out.println("Fun A2 called from class Arun");
}
}
class Bhuvan
{
public static void main(String args[])
{
Arun ob=new Arun();
ob.flowers();
ob.fourt();
}
}