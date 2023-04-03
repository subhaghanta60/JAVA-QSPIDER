class Project
{
void getproject()
{
System.out.println("Do This Project");
}
}

class Infosys
{
public static void main(String [] args)
{
Project P1=new Project();
Developer.projectneed(P1);
}
}

class Developer 
{
static void projectneed(Project P2)
{
P2.getproject();
}
}

