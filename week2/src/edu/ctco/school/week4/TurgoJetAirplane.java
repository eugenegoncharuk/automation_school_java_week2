package edu.ctco.school.week4;

public class TurgoJetAirplane extends Fly implements Speed, Description {

    String name = "I am Turbo Jet Airplane";

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
        System.out.println("My fly average speed is " + SPEED_TURBO_JET_AIRPLAN + " km/h");
    }

}
