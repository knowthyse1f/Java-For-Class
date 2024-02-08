// 4 mejor concept in oops
//1. Abstraction 2.Incapsulation 3.Inharetance 4.Polymorphism

class Pen{
    String coolor;
    String type; //ballpoint; gel
    Pen(){
        System.out.println("Constructor for pen ");
    }
    public void write(){
        System.out.println("Write Something ");
    }
    // in java function called method 

    public void printColor(){
        System.out.println(this.coolor);
    }

}
//Object  can any thing in this real world 

//object instruction blueprint is called class 

// java constructor construct java object 

//constructor three type 1. Non perameter constructor 2.Perameter Constructor 3.Copy Constructor 

//Constructor name must be class name // nothing return from constructor //Constructor call one time 

//java made by default constructor 

//Java default destructor 
class Student{
    String name;
    int regNo;

    //same name function in one class it called polymorphism 
    //Function loading 
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.regNo);
    }

    public void printInfo(int regNo){
        System.out.println(this.regNo);
    }
    public void printInfo(String name){
        System.out.println(this.name);
       
    }
    Student(String name, int regNo){
        this.name= name; //this.name object name -> perameter name 
        this.regNo=regNo;
    }
    

}

class Mobile{
    String name;
    String brand;

    Mobile(Mobile m1){
        this.name=m1.name;
        this.brand=m1.brand;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.brand);
    }
    Mobile(){

    }
}

class Shape{
   public void area(){
    System.out.println("Display Area ");
   }
}

//inharetance  single level 
class Triangle extends Shape{
    public void area (int l , int h){
        System.out.println(1/5*l*h);
    }
}

class 


public class OOPS{

        public static void main(String args[]){

            // Triangle t1=new Triangle();
            // t1.color="RED";

            // System.out.println(t1.color);



            // //pen1 is a object of class 
            // Pen pen1=new  Pen();
            // pen1.coolor="Red";
            // pen1.type="gel";

            // Pen pen2=new  Pen();
            // pen2.coolor="Black";
            // pen2.type="ballpoint ";

            // Mobile m1= new Mobile();
            // m1.name="Z40";
            // m1.brand="Symphone";

            // Mobile m2=new Mobile(m1);
            
            // Student s1=new Student("Md. Yak Safu",2021831053);
            // pen1.write();
            // pen1.printColor();
            // pen2.printColor();
            // s1.printInfo();
            // s1.printInfo(s1.regNo);
            // m2.printInfo();

        }
}

/* 
 * polymorphisom 
 * one works many works its called polymorphisom 
 * 2 types of polymorphism 1.Over loading -> compile time -> this means when we checkk our compaile code 
 * 2.Over Over reading -> runtime -> this means when we run a application and it dont work properly 
 */

 /*
  * Inheritence 
    one generation to take another generation 
    not only properties but also method when another class inherit it that process take place is called inheritance 
    increase reuseability -> base class/parent class  to child class

    4 types of inheritance 
    1. Single level inheritance 
    base class -> drive class 
    2.Multi level inheritace 
    base class -> drived class-> drived class 
  */