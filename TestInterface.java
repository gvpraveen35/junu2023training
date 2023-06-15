interface Bank
{
float rateOfInterst();
}
class SBI implements Bank
{
public float rateOflnterest()
{
return 9.15f;
}
}
class PAN implements Bank
{
public float rateOfInterest()
{
return 9.7f;
}
}
class TestInterface
{
public static void main(String args[])
{
Bank b=new SBI();
System.out.println("ROI:"+b.rateOfInterst());
}
}