package com.harsh.interfaces;

public class NiceCar {

    private Engine engine;
    private final CDPlayer mediaPlayer = new CDPlayer();

    NiceCar(){
        this.engine = new PowerEngine();
    }

    NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void startMusic(){
        mediaPlayer.start();
    }

    public void stopMusic(){
        mediaPlayer.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
