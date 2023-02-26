class Sample 
{
static void area(double w,double h)
{

double result=w*h;
System.out.println(result);
}
}
class Rectangle
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(10.5,5.9);
System.out.println("End");
}
}