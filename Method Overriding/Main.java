class Whatsapp_v1 {
void status() {
System.out.println("Status for 30 sec");
}
}

class Whatsapp_v2 extends Whatsapp_v1 {
void status(){
    
System.out.println("Status For 15 sec");
}
}

class Main 
{
public static void main(String [] args){
Whatsapp_v2 w =new Whatsapp_v2();
w.status();
}
}