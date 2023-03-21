class School
{
char Grade;
String Name;
int Strength;

School(char a,String b,int c)
{
Grade=a;
Name=b;
Strength=c;

}
public static void main(String [] args)
{

School S1=new School('A',"Lowada High School",1000);
System.out.println("The School  name is "+ S1.Name);
System.out.println("The School Grade is "+ S1.Grade);
System.out.println("The Strength of the school  is "+ S1.Strength);
}
}