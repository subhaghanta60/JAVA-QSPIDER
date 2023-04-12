class Sample {
public static void main(String [] args){
System.out.println("*** Widening ***");
double x=20;
System.out.println(x);
double y=20.67f;
System.out.println(y);
System.out.println("*** Narrowing");
int a=(int)20.65d;
System.out.println(a);
float b=(float)66.75d;
System.out.println(b);
}
}