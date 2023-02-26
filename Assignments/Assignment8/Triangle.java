class Triangle 
{
static double area()
{
int b=10;
int h=5;
double result=0.5*b*h;
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