interface Drawable
{
void draw();
}
class Rectangele implements Drawable
{
public void draw()
{
System.out.println("drawing rectangle");
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("drawing circle");
}
}
class TestiInterface1
{
public static void main(String args[])
{
Drawable d=new Circle();
Drawable d1=new Rectangele();
d.draw();
d1.draw();
}
} 
