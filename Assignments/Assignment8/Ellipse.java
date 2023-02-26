class Ellipse 
{
static double area()
{
final double pi=3.14;
 int a=5;
 int b=10;

double result=pi*a*b;
return result;
}
public static void main(String [] args)
{
System.out.println("Start");
double x=area();
double a=x+0.5;
System.out.println(a);
System.out.println("End");
}
}