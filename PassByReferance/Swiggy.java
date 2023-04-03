class Restudent
{
void foodcooked()
{
System.out.println("Let's Cooked the food");
}
}

class Swiggy
{
public static void main(String [] args)
{
Restudent R1=new Restudent();
Customer.foodcooked(R1);
}
}

class Customer 
{
static void foodcooked(Restudent R2)
{
R2.foodcooked();
}
}

