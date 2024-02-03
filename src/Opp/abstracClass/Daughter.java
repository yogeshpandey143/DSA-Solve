package Opp.abstracClass;

public class Daughter extends Parent{

    public Daughter(int age)
    {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("i am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i love iron man");
    }
}
