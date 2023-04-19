class Main
{
void Cost(int x){

System.out.println("The Cost of normal Mobile = "+ x);
}
void Cost(double y){

System.out.println("The Cost of Feature Mobile  = "+y);
}

void Cost(double x,String y){

System.out.println("The Cost of "+ y + "  = "  +x);
}
void Cost(String x,int y){

System.out.println("The Cost of "+x+"  = "+y);
}
}
class Mobile
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Cost(50000);
M1.Cost(50000.5);
M1.Cost(100000.0,"Android Mobile");
M1.Cost("Apple Mobile",1000000);
}
}