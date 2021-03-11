package com.example.laba1KKP.controller;

public class Greeting {

    private double speed1;
    private double speed2;
    private double mass1;
    private double mass2;
    private double speed3;

    public Greeting(double speed1,double speed2,double mass1,double mass2) {
        this.speed1 = speed1;
        this.speed2 = speed2;
        this.mass1 = mass1;
        this.mass2 = mass1;
        this.speed3=((speed1*mass1-speed2*mass2)/(mass1+mass2));
    }

    public double getSpeed() {
        return speed3;
    }

}