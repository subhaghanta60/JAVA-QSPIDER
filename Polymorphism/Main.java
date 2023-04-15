class Animal
{
void noise()
{
System.out.println("Some noise");
}
}

class Cat extends Animal
{
void noise(){
System.out.println("Meow Meow");
}
}

class Dog extends Animal
{
void noise(){
System.out.println("Bow Bow");
}
}

class Snake extends Animal
{
void noise()
{
System.out.println("Hizz Hizz");
}
}

class Stimulator{
static void Anisound(Animal a1)
{
a1.noise();
}
}

class Main {
public static void main(String [] args)
{
Cat c1=new Cat();
Dog d1=new Dog();
Snake s1=new Snake();
Stimulator.Anisound(c1);
Stimulator.Anisound(d1);
Stimulator.Anisound(s1);
}
}