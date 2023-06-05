import java.lang.String;
public class Day3StringExampul9
{
public static void main(String args[])
{
String s1=new String("Hello");
String s2=new String("World");
String s=String.format("%s %s",s1,s2);
System.out.println(s);
System.out.println(s.toString());
}
}