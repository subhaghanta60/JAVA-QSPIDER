class Sample
{
void add()
{
int a=2;
int b=3;
int c=a+b;
System.out.println(c);
}
}

class Main
{
public static void main(String [] args)
{
System.out.println("***Main Starts***");
Sample S1=new Sample();
S1.add();
System.out.println("*** Main Ends ****");
}
}