class Main
{
void Cost(int x){

System.out.println("The Cost of normal Laptop = "+ x);
}
void Cost(double y){

System.out.println("The Cost of Normal Laptop  = "+y);
}

void Cost(double x,String y){

System.out.println("The Cost of "+ y + "  = "  +x);
}
void Cost(String x,int y){

System.out.println("The Cost of "+x+"  = "+y);
}
}
class Laptop
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Cost(500000);
M1.Cost(500000.5);
M1.Cost(100000.0,"Multi Feature Laptop");
M1.Cost("Touch Screen Laptop",1000000);
}
}