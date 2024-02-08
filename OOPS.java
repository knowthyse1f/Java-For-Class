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
//constructor three type 1. Non perameter constructor 
//2.
//Constructor name must be class name // nothing return from constructor //Constructor call one time 

//java made by default constructor 
class Student{
    String name;
    int regNo;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.regNo);
    }
    Student(){
        System.out.println("Constructor called");
    }

}

public class OOPS{

        public static void main(String args[]){
            //pen1 is a object of class 
            Pen pen1=new  Pen();
            pen1.coolor="Red";
            pen1.type="gel";

            Pen pen2=new  Pen();
            pen2.coolor="Black";
            pen2.type="ballpoint ";
            
            Student s1=new Student();
            s1.name="Md. Yak Safu";
            s1.regNo=2021831053;

            pen1.write();
            pen1.printColor();
            pen2.printColor();
            s1.printInfo();
        }
}