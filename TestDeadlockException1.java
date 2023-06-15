class TestDeadlockException1
{
public static void main(String arsg[])
{
final String resource1="praveen";
final String resource2="praveen kumar";
Thread t1=new Thread()
{
public void run()
{
synchronized(resource1)
{
System.out.println("thread1:locked resource 1");
try
{
Thread.sleep(100);
}
catch(Exception e)
{
}
synchronized(resource2)
{
System.out.println("thread1:locked resource 2");
}
}
}
};
Thread t2=new Thread()
{
public void run()
{
synchronized(resource2)
{
System.out.println("thread2:locked resource 2");
try
{
Thread.sleep(100);
}
catch(Exception e)
{
}
synchronized(resource1)
{
System.out.println("thread1:locked resource 1");
}
}
}
};
t1.start();
t2.start();
}
}