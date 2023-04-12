class Sample
{
void fo(){
System.out.println("Fofo");
}
}

class Demo extends Sample 
{
void mo() {
System.out.println("Momo");
}
}

class Main
{
public static void main(String [] args){
System.out.println("Upcasting");
Sample S1 =new Demo();
S1.fo(); //one property
System.out.println("Downcasting");
Demo D1=(Demo)S1;
D1.fo();
D1.mo();

}
}