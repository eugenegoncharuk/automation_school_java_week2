package edu.ctco.school.week4;

public class HypersonicAirplane extends Fly implements Speed, Description{

    String name = "I am Hypersonic Airplane";


    @Override
    public void fly() {

        System.out.println(flyingHypersonic);
    }

    @Override
    public void description() {
        System.out.println(name + DESCRIPTION);
    }

    @Override
    public void speed() {
        System.out.println("My fly average speed is " + SPEED_HYPERSONIC_AIRPLAN + " km/h");
    }

}
