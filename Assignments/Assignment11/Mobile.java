class Mobile
{
double Cost;
String Model_Name;
String Color;

Mobile(double A,String B, String C)
{
Cost=A;
Model_Name=B;
Color=C;
}
public static void main(String [] args)
{

Mobile M1=new Mobile(1000.00,"Redmi","Blue");

System.out.println("The Mobile Cost is "+M1.Cost);
System.out.println("The Mobile Model name is "+M1.Model_Name);
System.out.println("The Mobile Colour is "+M1.Color);
}
}