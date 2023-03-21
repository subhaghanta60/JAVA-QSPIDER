class Tv
{
int Cost;
String Brand;
String Type;
Tv(int A,String B,String C)
{
Cost=A;
Brand=B;
Type=C;
}

public static void main(String [] args)
{

Tv T1=new Tv(1000,"Realme","LCD");
System.out.println("The Tv  Cost is "+ T1.Cost);
System.out.println("The Tv brand name is "+ T1.Brand);
System.out.println("The Tv Type  is "+ T1.Type);
}
}