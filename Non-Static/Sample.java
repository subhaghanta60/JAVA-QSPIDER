class Sample
{
void add()
{
int a=5;
int b=6;
int c=a+b;
System.out.println(c);
}

public static void main(String [] args)
{
System.out.println("***Main Start ***");
new Sample().add();
System.out.println("*** Main Ends ***");
}
}