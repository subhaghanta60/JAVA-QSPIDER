class Sample 
{
static void area()
{
final double pi=3.14;
 int a=5;
 int b=10;

double result=pi*a*b;
System.out.println(result);
}
}
class Ellipse
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}