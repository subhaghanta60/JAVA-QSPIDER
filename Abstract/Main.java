abstract class Demo {
abstract void mo();
abstract void fo();
}

abstract class Sample extends Demo {
void mo(){
System.out.println("momo");
}
}

class Memo extends Sample {
void fo(){
System.out.println("Fofo");
}
}

class Main
{
public static void main(String [] args){
Memo m1=new Memo();
m1.fo();
m1.mo();
}
}