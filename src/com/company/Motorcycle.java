package com.company;

public class Motorcycle {

    String model;
    String color;
    boolean engineState = false;

    void startEngine(){
        if (engineState == true)
            System.out.println("The engine alredy on");
        else{
            engineState = true;
            System.out.println("The engineis now on");
        }
    }

    void showAtts(){
        System.out.println("This motorcycle is " + color + " " + model);
        if (engineState == true)
            System.out.println("The engin is om.");
            else
            System.out.println("the engin is off.");

    }

    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle();
        motor.model = "Yamaha";
        motor.color = "Red";
        System.out.println("Calling showAtts...");
        motor.showAtts();
        System.out.println("----------------------");
        System.out.println("Starting endine...");
        motor.startEngine();
        System.out.println("-----------------------");
        System.out.println("Calling showAtts...");
        motor.showAtts();
        System.out.println("--------------------------");
        System.out.println("Starting engine...");
        motor.startEngine();
    }

}
