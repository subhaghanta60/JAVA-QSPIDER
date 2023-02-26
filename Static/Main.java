class Sample
{
static void add()
{
int a=5;
int b=6;
int c=a+b;
System.out.println(c);
}
}
class Main
{
public static void main(String [] args)
{
System.out.println("***Main Starts***");
Sample.add();
System.out.println("***Main Ends***");
}
}