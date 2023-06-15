class ChaildThread extends Thread
{
public void run()
{
for(int i=1;i<=4;i++)
{
try
{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("child thread exception-"+i);
}
}
}
class Test
{
public static void main(String args[])
throws Exception
{
ChaildThread th1=new ChaildThread();
th1.start();
th1.join();
System.out.println("main thred completed");
}
}
