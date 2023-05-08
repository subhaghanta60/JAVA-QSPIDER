class Primitive_Typecasting {

public static void main(String [] args){

System.out.println("***Widening***");
System.out.println("----Implecity----");
double x=10;
System.out.println(x);
System.out.println("------Emplecity-----");
double y=(double) 20;
System.out.println(y);

System.out.println("***Narrowing");
int a=(int) 10.25f;
System.out.println(a);

}
}