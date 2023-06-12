class cla extends Thread
{
public static void main(String args[])
{
cla obj=new cla();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("hksdhgbcijsid");

}

public void run()
{
System.out.println("thread from overriddern run mothed ere");
}
}