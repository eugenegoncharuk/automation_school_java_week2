package edu.ctco.school.week4;


public class Main {
    public static void main(String[] args) {

        Propeller_Airplane propeller_airplan=new Propeller_Airplane();
        propeller_airplan.description();
        propeller_airplan.fly();
        propeller_airplan.speed();

        RegGlider regGlider = new RegGlider();
        regGlider.description();
        regGlider.fly();
        regGlider.speed();

        HypersonicAirplane hypersonicAirplane = new HypersonicAirplane();
        hypersonicAirplane.description();
        hypersonicAirplane.fly();
        hypersonicAirplane.speed();

        TurgoJetAirplane turgoJetAirplane = new TurgoJetAirplane();
        turgoJetAirplane.description();
        turgoJetAirplane.fly();
        turgoJetAirplane.speed();

    }
}
