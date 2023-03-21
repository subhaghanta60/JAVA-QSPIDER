class Sample
{
int multi()
{
int a=2;
int b=3;
int c=a*b;
return c;
}
}

class Multiify
{
public static void main(String [] args)
{
System.out.println("***Main Starts***");
Sample S1=new Sample();
int x=S1.multi();
System.out.println(x);
System.out.println("*** Main Ends ****");
}
}