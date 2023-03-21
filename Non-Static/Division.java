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
int x=new Sample().div(10,5);
int y=x+100;
System.out.println(y);
System.out.println("***Main Ends***");
}
}