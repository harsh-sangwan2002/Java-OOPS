package com.harsh.interfaces;

public class Main {

    public static void main(String[] args) {

        // This is also valid
//        Engine car1 = new Car();

//        Car car = new Car();

//        car.start();
//        car.accelerate();
//        car.brake();

        // This will call the stop engine method which is wrong
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.stopMusic();
        car.stop();

        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}
