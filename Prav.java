class Prav
{
public static void main(String args[])
{
int[] number={1,2,3,4,5,6};
int b=0;
for(int a : number)
{
b +=a;
}
int arrayLength=number.length;
double average = ((double)b/(double)arrayLength);
System.out.println("b="+b);
System.out.println("average="+average);
}
}