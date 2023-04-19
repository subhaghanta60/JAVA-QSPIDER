interface Nike {
void bags();
 void shoes();
}

class Ekart implements Nike {
public void bags(){
System.out.println("50 Jingalala Bags");
}
public void shoes(){
System.out.println("100 Jingalala Shoes");
}
}

public class Kolkata_outlet {
public static void main(String [] args){
Ekart  E1=new Ekart();
E1.bags();
E1.shoes();
}
}