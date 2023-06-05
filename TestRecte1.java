import java.util.*;
class Recte
{
int lenth;
int wedth;
void insert(int l,int w)
{
lenth=l;
wedth=w;
}
void Area()
{
System.out.println(lenth*wedth);
}
}
public class TestRecte1
{
public static void main(String args[])
{
Recte r1=new Recte(),r2=new Recte();

r1.insert(10,20);
r2.insert(20,10);
r1.Area();
r2.Area();
}

}

