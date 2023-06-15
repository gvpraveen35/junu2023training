class StringBulilderException7
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());
sb.append("hello");
System.out.println(sb.capacity());
sb.append("java is my jhillkj mhjk");
System.out.println(sb.capacity());
sb.ensureCapacity(10);
System.out.println(sb.capacity());
sb.ensureCapacity(50);
System.out.println(sb.capacity());
}
}