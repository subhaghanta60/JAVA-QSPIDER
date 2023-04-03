class Student
{
int std_id;
String std_name;
Student(int std_id,String std_name){
this.std_id=std_id;
this.std_name=std_name;
}
public static void main(String [] args)
{
Student s1=new Student(10,"Subha");

System.out.println(s1.std_id);
System.out.println(s1.std_name);
}
}