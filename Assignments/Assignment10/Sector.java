class Sample 
{
static void area(int t,double r)
{

double result=0.5*r*r*t;
System.out.println(result);
}
}
class Sector
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(10,5.5);
System.out.println("End");
}
}