class Home
{
long Cost;
String Name;
String Color;
Home(long A,String B,String C)
{
Cost=A;
Name=B;
Color=C;
}
public static void main(String [] args)
{

Home H1=new Home(1000000,"Villa","Green");
System.out.println("The Home  name is "+ H1.Name);
System.out.println("The Home Cost is "+ H1.Cost);
System.out.println("The Home Name is "+ H1.Name);
}
}