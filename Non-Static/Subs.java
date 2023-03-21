class Sample
{
int sub()
{
int a=10;
int b=5;
int c=a-b;
return c;
}
}
class Subs
{
public static void main(String [] args)
{
System.out.println("***Main Starts***");
int x=new Sample().sub();
System.out.println(x);
System.out.println("***Main Ends***");
}
}