class Sample 
{
static void area(int r)
{
final double pi=3.14;
double result=pi*r*r;
System.out.println(result);
}
}
class Circle
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(5);
System.out.println("End");
}
}