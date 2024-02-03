package Opp.abstracClass;

public abstract class Parent {
    int age;
    final int VALUE;


//    can create constructor in abstract class
    public Parent(int age)
    {
        this.age=age;
        VALUE=454687;
    }




    //can create static method in abstract class
    // not allow to override static method
    static void hello(){
        System.out.println("hey");
    }



    //can create normal method in abstract class
    void normal(){
        System.out.println("this is normal method");
    }



  abstract void career();
  abstract void partner();



}
