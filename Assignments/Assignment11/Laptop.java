class Laptop
{
long Cost;
String Name;
String Brand;
Laptop(long A,String B,String C)
{
Cost=A;
Name=B;
Brand=C;
}

public static void main(String [] args)
{

Laptop L1=new Laptop(10000,"Pavilion","Hp");

System.out.println("The Laptop Cost  is "+ L1.Cost);
System.out.println("The Laptop Brand name is "+ L1.Brand);
System.out.println("The Laptop  Name is "+ L1.Name);
}
}