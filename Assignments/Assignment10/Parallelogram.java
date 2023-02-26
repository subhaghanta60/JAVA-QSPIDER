class Sample 
{
static void area(double b, double h)
{

double result=b*h;
System.out.println(result);
}
}
class Parallelogram
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(10.8,5.6);
System.out.println("End");
}
}