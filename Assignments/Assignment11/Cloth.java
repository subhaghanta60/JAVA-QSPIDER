class Cloth
{
int Cost;
String Color;
String Size;

Cloth(int x, String y,String z)
{
Cost=x;

Color=y;
Size=z;
}
public static void main(String [] args)
{

Cloth C1= new Cloth(1000,"Pink","XL");
System.out.println("The Cloth Color   is "+C1. Color);
System.out.println("The Cloth Cost is "+ C1.Cost);
System.out.println("The Cloth Size is "+ C1.Size);
}
}