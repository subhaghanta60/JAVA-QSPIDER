interface Resturant
{
void food();
}

class Chicken_Biriyani implements Resturant {
public void food() {
System.out.println("Chicken Ka Biriyani");
}
}

class Moton_Biriyani implements Resturant {
public void food(){
System.out.println("Motton Ka Biriyani");
}
}


class Aloo_Biriyani implements Resturant {
public void food(){
System.out.println("Aloo Ka Biriyani");
}
}

class Waiter {

static void serve(Resturant R1){
R1.food();
}
}
class Customer {
public static void main(String [] args){

Chicken_Biriyani C1= new Chicken_Biriyani();
Moton_Biriyani M1 = new Moton_Biriyani();
Aloo_Biriyani A1 = new Aloo_Biriyani();

Waiter.serve(C1);
Waiter.serve(M1);
Waiter.serve(A1);
}
}