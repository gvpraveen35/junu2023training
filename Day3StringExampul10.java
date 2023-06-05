import java.lang.String;
public class Day3StringExampul10
{
public static void main(String args[])
{
String s1=new String("Hello");
String s2=new String("World");
String s3=new String("java");
String s=String.join("\t",s1,s2,s3);
System.out.println(s);
System.out.println(s.toString());
}
}