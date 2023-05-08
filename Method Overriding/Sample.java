class Ola_v1 {
void ride() {
System.out.println("Ride With Cars");
}
}

class Ola_v2 extends Ola_v1 {

void ride(){

super.ride();
System.out.println("Ride with Bike");
}
}

class Sample 
{
public static void main(String [] args){
Ola_v2 o =new Ola_v2();
o.ride();
}
}