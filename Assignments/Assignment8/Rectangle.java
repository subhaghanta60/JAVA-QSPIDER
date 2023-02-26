class Rectangle 
{
static double area()
{
double w=10.5;
double h=5.9;
double result=w*h;
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