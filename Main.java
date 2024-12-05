import java.util.*;
import java.io.*;
class Main
{
public static void main(String args[]){
Dog dog=new Dog();

dog.displayNames();
}
}

class Animal{
String name="Animal";
Animal(){
System.out.println("animal constructor is invoked");
}

}
class Dog extends Animal{
String name="Dog";
Dog(){
super();
System.out.println("dog constructor is invoked");
}

void displayNames(){
System.out.println("parent class name:"+super.name);
System.out.println("child class name:"+name);
}
}
