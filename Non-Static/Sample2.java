class Sample2
{
int multi()
{
int a=5;
int b=2;
int c=a*b;
return c;
}
public static void main(String [] args)
{
System.out.println("***Main Starts***");
int x=new Sample2().multi();
System.out.println(x);
System.out.println("*** Main Ends***");

}
}