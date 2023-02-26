class Sample 
{
static void area()
{

double a=5.5;
double result=a*a;
System.out.println(result);
}
}
class Square
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}