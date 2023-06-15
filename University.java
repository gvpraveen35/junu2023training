import java.util.io;
import java.util.*;
 class College
{
public String name;
public String Address;
College(String name,String address)
{
this.name=name;
this.address=address;
}
}
class University
{
private final List<College>colleges;
University (List<College>college)
{
this.college=college;
}
public List<College>getTotalCollegesInUniversity()
{
return colleges;
}
}
class CompositionExample
{
public static void main(String[] args)
{
College c1=new College("ABES Engineering College","Kuppam");
College c1=new College("MTIET Engineering College","Ram Kuppam"); 
College c1=new College("KUPPAM Engineering College","TUKuppam");
List<College>college=new ArrayList<College>();
College.add(c1);
College.add(c2);
College.add(c3);
University University =new University(College);
List<College>college=University.getTotalCollegesInUnivercity ();
for(College cg:college)
{
System.out.println("name:"+cg.name+"and"+"Address:"+cg.address);
}
}
}