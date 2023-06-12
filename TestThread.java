class TestThread extends Thread
{
public static void main(String args[])
{
TestThread tod=new TestThread();
tod.start();
System.out.println("this code is out said of thread");
}
public void run()
{
System.out.println("this code is runuing in thread");
}
} 