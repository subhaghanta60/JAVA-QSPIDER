class Sample 
{
static void area()
{
double b=10.8;
double h=5.6;
double result=b*h;
System.out.println(result);
}
}
class Parallelogram
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}