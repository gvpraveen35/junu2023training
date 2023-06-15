//class MyThread extends Thread
//{

class TestShutdown12
{
public static void main(String args[])
throws Exception
{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new Thread()
{

public void run()
{
System.out.println("shat down hook task completed");
}
}
);
System.out.println("Now main sleeping.... press ctrl+c to exit");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
}
}
}