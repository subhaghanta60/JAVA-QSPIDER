interface Sample {
void mo();
public abstract void fo();
}

class Demo implements Sample {
public void mo(){
System.out.println("Momo");
}
public void fo(){
System.out.println("FOFO");
}
}

class  Main {
public static void main(String [] args){
Demo D1=new Demo();
D1.fo();
D1.mo();
}
}