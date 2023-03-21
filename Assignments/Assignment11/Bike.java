class Bike
{
long Cost;
String Brand;
String Color;
Bike(long x,String y,String z){
Cost=x;
Brand=y;
Color=z;
}

public static void main(String [] args)
{

Bike B1=new Bike(80000,"ola","White");
System.out.println("The Bike Cost is "+ B1.Cost);
System.out.println("The Bike brand name is "+ B1.Brand);
System.out.println("The Bike Color is "+ B1.Color);
}
}