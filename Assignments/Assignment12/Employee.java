class Main
{
void Salary(int x){

System.out.println("The Salary of normal Emp = "+ x);
}
void Salary(double y){

System.out.println("The Salary of normal Emp  = "+y);
}

void Salary(double x,String y){

System.out.println("The Salary of "+ y + "  = "  +x);
}
void Salary(String x,int y){

System.out.println("The Salary of "+x+"  = "+y);
}
}
class Employee
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Salary(50000);
M1.Salary(50000.5);
M1.Salary(10000.000,"Subha");
M1.Salary("Raktim",1000000);
}
}