import java.util.*;
class Author
{
String authorName;
int age;
String place;
//Author class constructor
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author author;//author daitails
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[])
{
Author author=new Author("john",42,"USA");
Book b=new Book("java for Biggdrers",8000,author);
System.out.println("Book Name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("............Aithor datials..");
System.out.println("Author Name:"+b.author.authorName);
System.out.println("Author age:"+b.author.age);
System.out.println("Author place:"+b.author.place);
}
}


