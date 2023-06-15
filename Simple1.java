import java.util.*;
public class Simple1
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my,name,is,praveen");

System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
}
}
