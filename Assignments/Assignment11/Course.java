class Course
{
long Exam_Cost;
String Course_Name;
String University_Name;

 Course(long a,String b,String c)
 {
 Exam_Cost=a;
 Course_Name=b;
 University_Name=c;
 }



public static void main(String [] args)
{
Course C1= new Course(100000, "B.tech","Makaut");

System.out.println("The Course  name is "+ C1.Course_Name);
System.out.println("The University name is "+ C1.University_Name);
System.out.println("The Exam Cost is "+ C1.Exam_Cost);
}
}