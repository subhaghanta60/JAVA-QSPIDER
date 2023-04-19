class Main
{
void Cost(int x){

System.out.println("The Cost of This Cloth = "+ x);
}
void Cost(double y){

System.out.println("The Cost of This Cloth  = "+y);
}

void Cost(double x,String y){

System.out.println("The Cost of "+ y + "  = "  +x);
}
void Cost(String x,int y){

System.out.println("The Cost of "+x+"  = "+y);
}
}
class Cloth
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Cost(500);
M1.Cost(500.5);
M1.Cost(100.000,"Jeans");
M1.Cost("Shirt",1000);
}
}