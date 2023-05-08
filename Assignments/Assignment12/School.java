class Main
{
void Rollno(int x){

System.out.println("The Roll Number start from = "+ x);
}
void Rollno(String y){

System.out.println("The Last Roll Number  = "+y);
}

void Rollno(double x,String y){

System.out.println("The Roll no  "+ y + " is  = "  +x);
}
void Rollno(String x,int y){

System.out.println("The Roll no of "+x+"  is = "+y);
}
}
class School
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Rollno(1);
M1.Rollno("100");
M1.Rollno(10,"Subha");
M1.Rollno("Raktim",5);
}
}