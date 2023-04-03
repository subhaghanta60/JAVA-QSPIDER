class Simcard
{
void recharge()
{
System.out.println("Let's do a Recharge");
}
}

class Paytm
{
public static void main(String [] args)
{
Simcard S1=new Simcard();
Customer.needrecharge(S1);
}
}

class Customer 
{
static void needrecharge(Simcard S2)
{
S2.recharge();
}
}

