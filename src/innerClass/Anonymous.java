package innerClass;


abstract class Person{
    abstract void display();
}
public class Anonymous {


    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            void display() {
                System.out.println("this is anonymous class");
            }
        };

        person.display();
    }
}
