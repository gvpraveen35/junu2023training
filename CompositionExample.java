
import java.util.*;
 class College
{
public String name;
public String address;
College(String name,String address)
{
this.name=name;
this.address=address;
}
}
class University
{
private final List<College>Colleges;
University (List<College>Colleges)
{
this.Colleges=Colleges;
}
public List<College>getTotalCollegesInUniversity()
{
return Colleges;
}
}
class CompositionExample
{
public static void main(String[] args)
{
College c1=new College("ABES Engineering College","Kuppam");
College c2=new College("MTIET Engineering College","Ram Kuppam"); 
College c3=new College("KUPPAM Engineering College","TUKuppam");
List<College>college=new ArrayList<College>();
college.add(c1);
college.add(c2);
college.add(c3);
University University =new University(college);
List<College>Colleges=University.getTotalCollegesInUniversity ();
for(College cg:college)
{
System.out.println("name:"+cg.name+"and"+"Address:"+cg.address);
}
}
}