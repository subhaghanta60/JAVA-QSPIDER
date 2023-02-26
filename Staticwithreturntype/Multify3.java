class Sample
{
static void multify(int a,int b,int c)
{
int d=a*b*c;
System.out.println(d);
}
}
class Multify3
{
public static void main(String [] args)
{
System.out.println("***Main Start ***");
Sample.multify(2,3,2);
System.out.println("***Main Ends***");
}
}