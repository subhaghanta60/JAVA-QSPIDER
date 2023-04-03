class Hotel
{
void bookhotel()
{
System.out.println("Hotel Booking is Successful");
}
}

class Oyo
{
public static void main(String [] args)
{
Hotel H1=new Hotel();
Customer.needhotel(H1);
}
}

class Customer 
{
static void needhotel(Hotel H2)
{
H2.bookhotel();
}
}

