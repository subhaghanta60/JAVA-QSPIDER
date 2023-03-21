class Employee
{
double Salary;
long Id;
char Grade;
Employee(double a,long b,char c)
{
Salary=a;
Id=b;
Grade=c;

}
public static void main(String [] args)
{

Employee E1= new Employee(10000.25,10555202,'A');

System.out.println("The Emploeye  Salary is "+ E1.Salary);
System.out.println("The Employee Id  "+ E1.Id);
System.out.println("The Employee Grade is "+ E1.Grade);
}
}