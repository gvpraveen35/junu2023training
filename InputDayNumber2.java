import java.util.Scanner;
class InputDayNumber2
{
public static void displayDay(int n)
{
switch(n)
{
case 1:System.out.println("JANVARY");
break;
case 2:System.out.println("FEBRAVARY");
break;
case 3:System.out.println("MARCH");
break;
case 4:System.out.println("APRILE");
break;
case 5:System.out.println("MAY");
break;
case 6:System.out.println("JUNU");
break;
case 7:System.out.println("JULY");
break;
case 8:System.out.println("AUGUST");
break;
case 9:System.out.println("SEPTEMBER");
break;
case 10:System.out.println("OCTBER");
break;
case 11:System.out.println("NOVAMBER");
break;
case 12:System.out.println("DESEMBER");
break;
default:System.out.println("ENTER BELOW 0-11");
}
}

public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int day;
day=scob.nextInt();
displayDay(day);
}
}