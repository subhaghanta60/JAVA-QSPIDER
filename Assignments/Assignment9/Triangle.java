class Sample 
{
static void area()
{
int b=10;
int h=5;
double result=0.5*b*h;
System.out.println(result);
}
}
class Triangle
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}