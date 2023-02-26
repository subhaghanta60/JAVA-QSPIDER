class Sample 
{
static void area(double a)
{

double result=a*a;
System.out.println(result);
}
}
class Square
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(5.5);
System.out.println("End");
}
}