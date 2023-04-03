class Delivaryboy
{
void deliver()
{
System.out.println("Let's Deliver This item");
}
}

class Delivery
{
public static void main(String [] args)
{
Delivaryboy D1=new Delivaryboy();
Customer.needdeliver(D1);
}
}

class Customer 
{
static void needdeliver(Delivaryboy D2)
{
D2.deliver();
}
}

