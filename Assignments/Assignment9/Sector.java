class Sample 
{
static void area()
{
int t=10;
double r=5.5;
double result=0.5*r*r*t;
System.out.println(result);
}
}
class Sector
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}