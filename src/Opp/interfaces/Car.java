package Opp.interfaces;

public class Car implements Engine ,Brake {
    @Override
    public void brake() {
        System.out.println("this is brake");
    }

    @Override
    public void start() {
        System.out.println("this is start");
    }

    @Override
    public void stop() {
        System.out.println("this is stop");

    }

    @Override
    public void acc() {

        System.out.println("this is acc");

    }
}
