class Sector 
{
static double area()
{
int t=10;
double r=5.5;
double result=0.5*r*r*t;
return result;

}
public static void main(String [] args)
{
System.out.println("Start");
double x=area();
double y=x+0.5;
System.out.println(y);
System.out.println("End");
}
}