class Sample 
{
static void area(int b,int h)
{
double result=0.5*b*h;
System.out.println(result);
}
}
class Triangle
{
public static void main(String [] args)
{
System.out.println("Start");
Sample.area(10,5);
System.out.println("End");
}
}