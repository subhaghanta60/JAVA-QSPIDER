class Main
{
void Cost(int x){

System.out.println("The Cost of This Course = "+ x);
}
void Cost(String y){

System.out.println("The Cost of This = "+y);
}

void Cost(int x,String y){

System.out.println("The Cost of "+ y + " Cousrse = "  +x);
}
void Cost(String x,int y){

System.out.println("The Cost of "+x+" Cousrse = "+y);
}
}
class Course
{
public static void main(String [] args)
{
Main M1=new Main();
M1.Cost(10);
M1.Cost("10.00");
M1.Cost(10,"Data Science");
M1.Cost("Web Dev",10);
}
}