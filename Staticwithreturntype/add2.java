class Sample
{
static void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}
}
class add2
{
public static void main(String [] args)
{
System.out.println("***Main Start ***");
Sample.add(5,10);
System.out.println("***Main Ends***");
}
}