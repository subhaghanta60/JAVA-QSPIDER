class Main
{
void speed(int x){

System.out.println("The Speed of bike = "+ x);
}
void speed(Double y){

System.out.println("The Speed of bike = "+y);
}

void speed(int x,String y){

System.out.println("The Speed of bike = "+x +y);
}
void speed(String x,int y){

System.out.println("The Speed of bike = "+y+x);
}
}
class Bike
{
public static void main(String [] args)
{
Main M1=new Main();
M1.speed(10);
M1.speed(10.00);
M1.speed(10,"Km/h");
M1.speed("Km/h",10);
}
}