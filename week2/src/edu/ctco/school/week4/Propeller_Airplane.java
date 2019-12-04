package edu.ctco.school.week4;

public class Propeller_Airplane extends Fly implements Speed, Description{

    String name = "I am Propeller Airplane";


    @Override
    public void fly() {

        System.out.println(flyingTypeGlide);
    }

    @Override
    public void description() {
        System.out.println(name + DESCRIPTION);
    }

    @Override
    public void speed() {
        System.out.println("My fly average speed is " + SPEED_PROP_AIRPLAN + " km/h");
    }

}
