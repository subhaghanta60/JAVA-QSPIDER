class Demo
{
void fo(){
System.out.println("fo fo");
}
}

class Sample extends Demo {
void mo(){
System.out.println("Momo");
}
}

class Derive_typecasting {

public static void main(String [] args){

Demo d1 = new Sample();
d1.fo();
Sample s1 = (Sample) d1;
s1.fo();
s1.mo();


}

}