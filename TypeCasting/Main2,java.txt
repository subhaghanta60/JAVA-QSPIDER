class Sample 
{
void mo()
{
System.out.println("Momo");
}
}
class Demo extends Sample
{
void mo()
{
System.out.println("Fofo");
}
}

class Main2
{
public static void main(String [] args)
{
System.out.println("Case Study Of Upcasing + Method Overridding");
Sample S1 =new Demo();
S1.mo();
}
}