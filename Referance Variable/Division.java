class Sample
{
int div(int a,int b)
{

int c=a/b;
return c;
}
}

class Division
{
public static void main(String [] args)
{
System.out.println("***Main Starts***");
Sample S1=new Sample();
int x=S1.div(10,2);
System.out.println(x);
System.out.println("*** Main Ends ****");
}
}