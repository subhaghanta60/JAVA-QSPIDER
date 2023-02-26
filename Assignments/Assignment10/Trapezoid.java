class Sample 
{
static void area(int a,int b,int h)
{

double result= 0.5*(a+b) *h;
System.out.println(result);
}
}
class Trapezoid
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(10,5,5);
System.out.println("End");
}
}