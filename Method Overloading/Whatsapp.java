class Whatsapp
{
//Variation in data type
static void sent(int x) {
System.out.println("Hey I am an Integer = "+x);
}
static void sent(String y){
System.out.println("Hey I am a String = " + y);
}
//Variation in Length
static void sent(int x, String y){
System.out.println("Hey I am a Combination of Integer and String =" + x + " & " +y);
}
//variation in ordr
static void sent(String x, int y)
{
System.out.println("Hey I am a Combination of String and Integer =" + x + " & "+ y);
}
public static void main(String [] args)
{
sent(1);
sent("Subha");
sent(10, "Subha");
sent("Subha", 10);
}
}
