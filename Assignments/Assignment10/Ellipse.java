class Sample 
{
static void area(int a,int b)
{
final double pi=3.14;


double result=pi*a*b;
System.out.println(result);
}
}
class Ellipse
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(5,10);
System.out.println("End");
}
}