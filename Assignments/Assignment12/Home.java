class Main
{
void Cost(int x){

System.out.println("The Cost of This Home = "+ x);
}
void Cost(String y){

System.out.println("The Cost of This Home  = "+y);
}

void Cost(double x,String y){

System.out.println("The Cost of "+ y + " Building = "  +x);
}
void Cost(String x,int y){

System.out.println("The Cost of "+x+" Building = "+y);
}
}
class Home
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Cost(10000);
M1.Cost("1000.000");
M1.Cost(100.000,"Qspider");
M1.Cost("jspider",1000);
}
}