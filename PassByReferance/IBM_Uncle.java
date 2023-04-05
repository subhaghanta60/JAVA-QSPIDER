class IBM_Aunty
{
void job()
{
System.out.println("Software Job");
}
}
class IBM_Uncle
{
public static void main(String [] args)
{
IBM_Aunty a1 =new IBM_Aunty();
Dinga.needjob(a1);
Dingi.needjob(a1);
}
}

class Dinga
{
static void needjob(IBM_Aunty a2){
a2.job();
}
}
class Dingi
{
static void needjob(IBM_Aunty a3){
a3.job();
}
}