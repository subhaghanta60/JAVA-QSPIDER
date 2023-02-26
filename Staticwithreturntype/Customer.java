class Tcs
{
static double req()
{
double app_cost=1000.00;
double emp_cost=500.00;
double project_cost=app_cost+emp_cost;
return project_cost;
}
}

class Customer
{
public static void main(String [] args)
{
System.out.println("***Project Starts***");
double pay=Tcs.req();
double final_pay=pay+200.00;
System.out.println(final_pay);
System.out.println("*** Project Ends***");
}
}