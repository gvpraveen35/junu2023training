class Task extends Thread
{
String thrna;
public Task(String name)
{
thrna=name;
}
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println(thrna+"is Daemon Thread");
}
else
{
System.out.println(thrna+"is user Thread");
}
}
public static void main(String args[])
{
Task thread1=new Task("thread1");
Task thread2=new Task("thread2");
thread1.start();
thread2.start();
}
}


