class Whatsapp
{
void status(int x){

System.out.println("Hi");
}
void status(String y){

System.out.println("Hello");
}

void status(int x,String y){

System.out.println("Hey");
}
void status(String x,int y){

System.out.println("Bye");
}
}
class Main
{
public static void main(String [] args)
{
Whatsapp w1=new Whatsapp();
w1.status(10);
w1.status("Hi");
w1.status(10,"Hi");
w1.status("Hi",10);
}
}