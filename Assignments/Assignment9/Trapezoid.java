class Sample 
{
static void area()
{
int a=10;
int b=5;
int h=5;
double result= 0.5*(a+b) *h;
System.out.println(result);
}
}
class Trapezoid
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}