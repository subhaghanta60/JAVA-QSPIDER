class Car
{
long Cost;
String Model_Name;
String Fuel;
Car(long x, String y, String z){
    Cost=x;
    Model_Name=y;
    Fuel=z;
}
public static void main(String [] args)
{

Car C1=new Car(50000,"Tata Nexon", "Petrol");
System.out.println("The Cost of the  car is "+ C1.Cost);
System.out.println("The Model name is "+ C1.Model_Name);
System.out.println("The Fuel Type is "+ C1.Fuel);
}
}