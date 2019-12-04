package edu.ctco.school.week4;

public class RegGlider  extends Fly implements Speed, Description {

    String name = "I am Regular Glider";


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
        System.out.println("My fly average speed is " + SPEED_REG_GLIDER + " km/h");
    }

}
