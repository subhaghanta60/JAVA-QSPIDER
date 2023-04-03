class Cabdriver
{
void drive()
{
System.out.println("Let's Ride");
}
}
class Customer 
{
static void needrive(Cabdriver C2)
{
C2.drive();
}
}
class Ola
{
public static void main(String [] args)
{
Cabdriver C1=new Cabdriver();
Customer.needrive(C1);
}
}

