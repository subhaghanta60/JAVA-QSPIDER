class Circle 
{
static double area()
{
final double pi=3.14;
int r=5;
double result=pi*r*r;
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