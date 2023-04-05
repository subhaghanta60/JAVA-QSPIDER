class Blocks
{
static {
System.out.println("This is Static initialization Block");
}
{
System.out.println("This is Instant Initialization Block");
}
public static void main(String [] args){
new Blocks();
}
}