class Sample 
{
static void area()
{
final double pi=3.14;
int r=5;
double result=pi*r*r;
System.out.println(result);
}
}
class Circle
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area();
System.out.println("End");
}
}