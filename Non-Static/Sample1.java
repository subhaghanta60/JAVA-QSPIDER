class Sample1
{
void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}

public static void main(String [] args)
{
System.out.println("***Main Start***");
new Sample1().add(5,6);
System.out.println("***Main Ends***");
}
}