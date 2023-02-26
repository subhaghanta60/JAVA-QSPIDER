class Sample 
{
static void area()
{
double w=10.5;
double h=5.9;
double result=w*h;
System.out.println(result);
}
}
class Rectangle
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}