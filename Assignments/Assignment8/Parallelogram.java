class Parallelogram 
{
static double area()
{
double b=10.8;
double h=5.6;
double result=b*h;
return result;
}
public static void main(String [] args)
{
System.out.println("Start");
double x=area();
double y=x+0.5;
System.out.println(y);
System.out.println("End");
}
}