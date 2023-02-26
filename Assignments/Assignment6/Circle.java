class Circle 
{
static void area(int r)
{
final double pi=3.14;

double result=pi*r*r;
System.out.println(result);
}
public static void main(String [] args)
{
System.out.println("Start");
area(5);
System.out.println("End");
}
}