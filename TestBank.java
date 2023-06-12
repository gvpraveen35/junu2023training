import java.util.*;
abstract class Bank
{
abstract int grtRentOfInterest();
}
class SBI extends Bank
{
int grtRentOfInterest()
{
return 7;
}
}
class PAN extends Bank
{
int grtRentOfInterest()
{
return 8;
}
}
class TestBank
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Rate of interest is"+b.grtRentOfInterest()+"%");
b=new PAN();
System.out.println("Rate of interest is"+b.grtRentOfInterest()+"%");
}
}