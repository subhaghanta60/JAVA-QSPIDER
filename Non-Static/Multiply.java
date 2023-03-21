class Sample
{
void multi(int a,int b)
{
int c=a*b;
System.out.println(c);
}
}

class Multiply
{
public static void main(String [] args)
{
System.out.println("***Main Start***");
new Sample().multi(2,3);
System.out.println("***Main Ends***");
}
}
