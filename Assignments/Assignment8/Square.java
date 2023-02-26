class Square 
{
static double area()
{

double a=5.5;
double result=a*a;
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