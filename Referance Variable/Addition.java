class Sample
{
void add(int a,int b)
{

int c=a+b;
System.out.println(c);
}
}

class Addition
{
public static void main(String [] args)
{
System.out.println("***Main Starts***");
Sample S1=new Sample();
S1.add(5,6);
System.out.println("*** Main Ends ****");
}
}