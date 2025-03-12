public class base  extends superbase{
// base constructor
    base(){
        System.out.println("Constructur is call");
    }

    String name ;
    int age ;
    float salary;
    // seter fucntion
    void seter(String name,int age,float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // geter function
    void show(){
        System.out.println("your name : " + name);
        System.out.println("your age : " + age);
        System.out.println("yout salary : " + salary);
    }




}