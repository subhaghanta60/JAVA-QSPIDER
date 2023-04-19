class Main
{
void Cost(int x){

System.out.println("The Cost of normal Tv = "+ x);
}
void Cost(double y){

System.out.println("The Cost of Feature Tv  = "+y);
}

void Cost(double x,String y){

System.out.println("The Cost of "+ y + "  = "  +x);
}
void Cost(String x,int y){

System.out.println("The Cost of "+x+"  = "+y);
}
}
class Tv
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Cost(5000);
M1.Cost(5000.5);
M1.Cost(100000.0,"Smart Tv");
M1.Cost("Tv with touch Screen",1000000);
}
}